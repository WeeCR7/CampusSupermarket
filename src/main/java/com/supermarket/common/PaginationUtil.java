package com.supermarket.common;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author zhanjiawei
 */
public class PaginationUtil<T> {

    public PageInfo<T> getPage(List<T> list) {
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

}
