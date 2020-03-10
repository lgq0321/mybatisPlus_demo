package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 面板定义表
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("panel_def")
@ApiModel(value="PanelDef对象", description="面板定义表")
public class PanelDef implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "id", type = IdType.NONE)
    private String id;

    @ApiModelProperty(value = "面板类型")
    @TableField("category")
    private String category;

    @ApiModelProperty(value = "面板名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "面板描述")
    @TableField("desc")
    private String desc;

    @ApiModelProperty(value = "统计周期，单位秒")
    @TableField("period")
    private Integer period;

    @ApiModelProperty(value = "创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "修改时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "1删除 0未删除 默认0")
    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty(value = "面板视图Id")
    @TableField("chart_id")
    private String chartId;

    @ApiModelProperty(value = "租户id")
    @TableField("tenant_id")
    private String tenantId;

    @ApiModelProperty(value = "面板预览图片url")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "面板的logoUrl")
    @TableField("logo_url")
    private String logoUrl;


}
