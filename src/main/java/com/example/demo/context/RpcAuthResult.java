package com.example.demo.context;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RpcAuthResult {

  private Integer code;

  private String message;

  /**
   * 返回code为200包含上下文结果
   */
  private RpcSystemContext context;

  public RpcAuthResult() {}

  public RpcAuthResult(Integer code, String message) {
    this.code = code;
    this.message = message;
  }
}
