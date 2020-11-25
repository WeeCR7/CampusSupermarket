package com.supermarket.common;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhanjiawei
 */
public class PaginationUtil<T> {

    public Map<String,Object> getPage(List<T> list) {
        PageInfo pageInfo = new PageInfo(list);
        Map<String,Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("result",pageInfo.getList());
        return map;
    }

}
