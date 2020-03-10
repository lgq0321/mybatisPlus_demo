package com.example.demo.context;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RpcPermissionParam {
  private String token;
  private String url;
  private String method;
  private String tenant;
  private String org;
  private String platform;

  public RpcPermissionParam() {}

  public RpcPermissionParam(String token, String url, String method, String tenant, String org, String platform) {
    this.token = token;
    this.url = url;
    this.method = method;
    this.tenant = tenant;
    this.org = org;
    this.platform = platform;
  }
}
