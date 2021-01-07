package com.supermarket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户菜单表
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_menu")
@ApiModel(value="UserMenuEntity对象", description="用户菜单表")
public class UserMenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单ID")
    private Integer menuId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;


}
