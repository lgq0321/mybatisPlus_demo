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
 * 角色-面板 关联表
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("panel_def_role")
@ApiModel(value="PanelDefRole对象", description="角色-面板 关联表")
public class PanelDefRole implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "id", type = IdType.NONE)
    private String id;

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

    @ApiModelProperty(value = "是否删除,0 未删除， 1 已删除")
    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty(value = "角色id")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty(value = "面板id")
    @TableField("panel_def_id")
    private String panelDefId;

    @ApiModelProperty(value = "机构id")
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty(value = "租户id")
    @TableField("tenant_id")
    private String tenantId;


}
