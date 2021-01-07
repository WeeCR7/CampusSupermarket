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

import com.supermarket.service.MenuService;
import com.supermarket.entity.MenuEntity;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Api(value = "MenuController", tags= { "菜单表"})
@RestController
@RequestMapping("/menu-entity")
public class MenuController{

    @Autowired
    private MenuService menuEntityService;

    @PostMapping("/list")
    @ApiOperation(value = "分页查询数据")
    public Result page(Page page, MenuEntity menuEntity){
        LambdaQueryWrapper<MenuEntity> wrapper = new QueryWrapper().lambda();
        IPage<MenuEntity> result = menuEntityService.page(page, wrapper);
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
        MenuEntity menuEntity = menuEntityService.getById(id);
        return Result.success(menuEntity);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增")
    public Result save(MenuEntity menuEntity){
        boolean result = menuEntityService.save(menuEntity);
        return Result.success(result);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public Result update(MenuEntity menuEntity) {
    boolean result = menuEntityService.updateById(menuEntity);
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
        boolean result = menuEntityService.removeById(id);
        return Result.success(result);
    }
}