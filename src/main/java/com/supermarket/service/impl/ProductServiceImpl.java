package com.supermarket.service.impl;

import com.supermarket.entity.ProductEntity;
import com.supermarket.mapper.ProductMapper;
import com.supermarket.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductEntity> implements ProductService {

}
