package com.supermarket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("menu")
@ApiModel(value="MenuEntity对象", description="菜单表")
public class MenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "菜单路径")
    private String menuPath;

    @ApiModelProperty(value = "菜单图标")
    private String menuIcon;


}
