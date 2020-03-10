package com.example.demo.entity;

import java.math.BigDecimal;
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
 * 面板实例表
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("panel_inst")
@ApiModel(value="PanelInst对象", description="面板实例表")
public class PanelInst implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "id", type = IdType.NONE)
    private String id;

    @ApiModelProperty(value = "控制台表ID")
    @TableField("control_panel_id")
    private String controlPanelId;

    @ApiModelProperty(value = "关联的面板定义表ID")
    @TableField("panel_def_id")
    private String panelDefId;

    @ApiModelProperty(value = "x轴坐标")
    @TableField("x")
    private BigDecimal x;

    @ApiModelProperty(value = "y轴坐标")
    @TableField("y")
    private BigDecimal y;

    @ApiModelProperty(value = "宽")
    @TableField("w")
    private BigDecimal w;

    @ApiModelProperty(value = "高")
    @TableField("h")
    private BigDecimal h;

    @ApiModelProperty(value = "APP排序")
    @TableField("order")
    private Integer order;

    @ApiModelProperty(value = "创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "修改时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "默认自己的id")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty(value = "默认自己的id")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty(value = "1删除 0未删除 默认0")
    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty(value = "租户id")
    @TableField("tenant_id")
    private String tenantId;


}
