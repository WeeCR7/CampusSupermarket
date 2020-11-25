package com.supermarket.service;

import com.github.pagehelper.PageInfo;
import com.supermarket.pojo.User;


public interface UserService {
    PageInfo<User> getUserList();
}
