package com.supermarket.web.controller;

import com.supermarket.common.Result;
import com.supermarket.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanjiawei
 */
@RestController
@RequestMapping("/supermarket/user")
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "分页查询账号信息", notes = "参数如:")
    @PostMapping("/list")
    public Result list(){
        return Result.success(userService.getUserList());
    }
}
