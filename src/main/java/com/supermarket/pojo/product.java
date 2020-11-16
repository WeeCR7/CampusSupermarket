package com.supermarket.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class product {
    @ApiModelProperty("商品id")
    private Integer id;

    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("商品价格")
    private float price;

    @ApiModelProperty("商品描述")
    private String description;

    @ApiModelProperty("生产日期")
    private DateTime productionDate;

    @ApiModelProperty("生产商")
    private String manufacturer;

    @ApiModelProperty("生产地")
    private String productionPlace;

    @ApiModelProperty("商品图片地址")
    private String imageUrl;
}
