package com.supermarket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanjiawei
 * @since 2021-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("product")
@ApiModel(value="ProductEntity对象", description="")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品价格")
    private Float price;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "商品生产日期")
    private LocalDateTime productionDate;

    @ApiModelProperty(value = "生产商")
    private String manufacturer;

    @ApiModelProperty(value = "生产地")
    private String productionPlace;

    @ApiModelProperty(value = "商品图片")
    private String imageUrl;


}
