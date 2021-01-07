package com.supermarket.service.impl;

import com.supermarket.entity.UserEntity;
import com.supermarket.mapper.IUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.supermarket.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, UserEntity> implements UserService {

}
