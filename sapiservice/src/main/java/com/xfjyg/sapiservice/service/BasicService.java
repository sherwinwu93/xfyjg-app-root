package com.xfjyg.sapiservice.service;

import com.xfjyg.sapiservice.entity.gen.TestResource;
import com.xfjyg.sapiservice.entity.gen.TestResourceExample;
import com.xfjyg.sapiservice.entity.gen.TestUser;
import com.xfjyg.sapiservice.entity.gen.TestUserExample;
import com.xfjyg.sapiservice.mapper.gen.TestResourceMapper;
import com.xfjyg.sapiservice.mapper.gen.TestUserMapper;
import com.xfjyg.sapiservice.security.JwtTokenUtil;
import com.xfjyg.sapiservice.security.JwtUser;
import com.xfjyg.sapiservice.utils.BeanUtilz;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@Slf4j
public class BasicService {
    @Autowired
    private TestUserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;

    public String login(String username, String password) {
        String token = null;
        TestUser user = getUserByUsername(username);
        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("用户名或密码不正确");
        }
        JwtUser userDetails = getUserDetails(username);
        token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    public TestUser doRegister(TestUser user) {
        if (getUserByUsername(user.getUsername()) != null)
            return null;
        TestUser newXhUser = BeanUtilz.copyProperties(user, TestUser.class);
        newXhUser.setPassword(passwordEncoder.encode(user.getPassword()));
        userMapper.insertSelective(newXhUser);
        return newXhUser;
    }

    public JwtUser getUserDetails(String username) {
        TestUser user = getUserByUsername(username);
        List<TestResource> resourceList = getResourceList(user.getTestUserId());
        return new JwtUser(user, resourceList);
    }

    private List<TestResource> getResourceList(Long userId) {
        TestResourceExample example = new TestResourceExample();
        example.createCriteria()
                .andUserIdEqualTo(userId);
        return resourceMapper.selectByExample(example);
    }

    @Autowired
    private TestResourceMapper resourceMapper;

    public TestUser getUserByUsername(String username) {
        if (StringUtils.isEmpty(username)) return null;
        TestUserExample example = new TestUserExample();
        example.createCriteria()
                .andUsernameEqualTo(username);
        List<TestUser> list = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) return null;
        return list.get(0);
    }
}
