package com.supermarket.common;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author zhanjiawei
 */
public class PaginationUtil<T> {

    PageInfo<T> getPage(List<T> list) {
        PageHelper.startPage(1, 10);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

}
