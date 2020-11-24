package com.supermarket.mapper;

import com.supermarket.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {


    /**
     * 分页查询
     * @return
     */
    List<Product> selectAll();


}
