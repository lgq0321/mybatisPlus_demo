package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 控制台表
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("control_panel")
@ApiModel(value="ControlPanel对象", description="控制台表")
public class ControlPanel implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "id", type = IdType.NONE)
    private int id;

    @ApiModelProperty(value = "平台类型pc，app")
    @TableField("platform")
    private String platform;

    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty(value = "面板类型")
    @TableField("category")
    private String category;

    @ApiModelProperty(value = "控制台名称")
    @TableField("name")
    private String name;

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

    private ControlPanel(int id, String name) {
        this(name);
        this.id = id;
    }

    public ControlPanel(int id) {
        this.id = id;
    }

    private ControlPanel(String name) {
        this.name = name;
    }

    public ControlPanel() {
        this(1,"name");
    }

    public void print(){

    }

}
