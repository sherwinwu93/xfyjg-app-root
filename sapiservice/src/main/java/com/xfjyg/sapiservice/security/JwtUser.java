package com.xfjyg.sapiservice.security;

import com.xfjyg.sapiservice.entity.gen.TestResource;
import com.xfjyg.sapiservice.entity.gen.TestUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUser implements UserDetails {

    private TestUser user;
    private List<TestResource> resourceList;

    public JwtUser(TestUser user, List<TestResource> resourceList) {
        this.user = user;
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return resourceList.stream()
                .map(resource ->new SimpleGrantedAuthority(resource.getResourceName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }
    /**
     * 账户是否未过期
     **/
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    /**
     * 账户是否未锁定
     **/
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    /**
     * 密码是否未过期
     **/
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    /**
     * 账户是否激活
     **/
    @Override
    public boolean isEnabled() {
        return user.getStatus().equals(1);
    }
}