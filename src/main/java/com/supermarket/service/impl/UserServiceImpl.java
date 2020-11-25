package com.supermarket.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supermarket.common.PaginationUtil;
import com.supermarket.mapper.UserMapper;
import com.supermarket.pojo.User;
import com.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> getUserList() {
        PaginationUtil<User> pagination = new PaginationUtil<>();
        PageHelper.startPage(1, 10);
        PageInfo<User> pageInfo = pagination.getPage(userMapper.getUserList());
        return pageInfo;
    }
}
