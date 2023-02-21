package com.xfjyg.managementservice.controller.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.gen.TestUser;
import com.xfjyg.managementservice.entity.gen.TestUserExample;
import com.xfjyg.managementservice.mapper.gen.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.xfjyg.managementservice.utils.R;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test/orm")
public class TestOrmController {
    @Autowired
    private TestUserMapper userMapper;

    @GetMapping(value = "/user/{userId}")
    public R user(@PathVariable("userId") Long userId) {
        return R.success(userMapper.selectByPrimaryKey(userId));
    }

    @GetMapping("/pageInfo")
    public R pageInfo(@RequestParam("pageIndex") Integer pageIndex,
                                   @RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<TestUser> testUsers = userMapper.selectByExample(new TestUserExample());
        return R.success(new PageInfo<>(testUsers));
    }
}
