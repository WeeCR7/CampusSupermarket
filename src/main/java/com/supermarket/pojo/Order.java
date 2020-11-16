package com.supermarket.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Order {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("商品id")
    private Integer productId;
}
