package com.example.demo.context;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

/**
 * 上下文实体 所有参数final只读
 */
@ApiModel(value = "上下文实体对象", description = "上下文实体")
@Value
public final class SystemContext {
  @ApiModelProperty(value = "租户id")
  private final String tenantId; //租户id
  @ApiModelProperty(value = "数据归集节点")
  private final String orgId; //数据归集节点
  @ApiModelProperty(value = "当前用户id")
  private final String userId; //当前用户id
  @ApiModelProperty(value = "平台类型")
  private final String platform; //平台类型
}
