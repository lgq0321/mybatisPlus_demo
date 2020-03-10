package com.example.demo.context;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RpcSystemContext {
  private String tenantId; //租户id
  private String orgId; //数据归集节点
  private String userId; //当前用户id
  private String platform; //平台类型
}
