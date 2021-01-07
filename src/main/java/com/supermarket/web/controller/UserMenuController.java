package com.supermarket.web.controller;

import com.supermarket.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.supermarket.service.UserMenuService;
import com.supermarket.entity.UserMenuEntity;

/**
 * <p>
 * 用户菜单表 前端控制器
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Api(value = "UserMenuController", tags= { "用户菜单表"})
@RestController
@RequestMapping("/user-menu-entity")
public class UserMenuController{

    @Autowired
    private UserMenuService userMenuEntityService;

    @PostMapping("/list")
    @ApiOperation(value = "分页查询数据")
    public Result page(Page page, UserMenuEntity userMenuEntity){
        LambdaQueryWrapper<UserMenuEntity> wrapper = new QueryWrapper().lambda();
        IPage<UserMenuEntity> result = userMenuEntityService.page(page, wrapper);
        return Result.success(result);
    }

    @PostMapping("/findById")
    @ApiOperation(value = "根据主键查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID", required = true,
                dataType = "Long", paramType = "query")
    })
    public Result findById(Long id) {
        if(id == null){
            return Result.fail("主键不能为空");
        }
        UserMenuEntity userMenuEntity = userMenuEntityService.getById(id);
        return Result.success(userMenuEntity);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增")
    public Result save(UserMenuEntity userMenuEntity){
        boolean result = userMenuEntityService.save(userMenuEntity);
        return Result.success(result);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public Result update(UserMenuEntity userMenuEntity) {
    boolean result = userMenuEntityService.updateById(userMenuEntity);
        return Result.success(result);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "根据主键删除")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "ID", required = true,
                dataType = "Long", paramType = "query")
    })
    public Result delete(Long id){
        if(id == null){
            return Result.fail("主键不能为空");
        }
        boolean result = userMenuEntityService.removeById(id);
        return Result.success(result);
    }
}