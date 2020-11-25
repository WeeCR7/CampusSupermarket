package com.supermarket.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supermarket.common.PaginationUtil;
import com.supermarket.mapper.UserMapper;
import com.supermarket.pojo.User;
import com.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String,Object> getUserList() {
        PaginationUtil<User> pagination = new PaginationUtil<>();
        PageHelper.startPage(1, 10);
        Map<String,Object> map = pagination.getPage(userMapper.getUserList());
        return map;
    }
}
