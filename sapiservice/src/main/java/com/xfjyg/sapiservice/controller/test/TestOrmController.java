package com.xfjyg.sapiservice.controller.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xfjyg.sapiservice.entity.gen.TestUser;
import com.xfjyg.sapiservice.entity.gen.TestUserExample;
import com.xfjyg.sapiservice.mapper.gen.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test/orm")
public class TestOrmController {
    @Autowired
    private TestUserMapper userMapper;

    @GetMapping(value = "/user/{userId}")
    public ResponseEntity user(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(userMapper.selectByPrimaryKey(userId));
    }

    @GetMapping("/pageInfo")
    public ResponseEntity pageInfo(@RequestParam("pageIndex") Integer pageIndex,
                                   @RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<TestUser> testUsers = userMapper.selectByExample(new TestUserExample());
        return ResponseEntity.ok(new PageInfo<>(testUsers));
    }
}
