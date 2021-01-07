package com.supermarket.service.impl;

import com.supermarket.entity.MenuEntity;
import com.supermarket.mapper.IMenuMapper;
import com.supermarket.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Service
public class MenuServiceImpl extends ServiceImpl<IMenuMapper, MenuEntity> implements MenuService {

}
