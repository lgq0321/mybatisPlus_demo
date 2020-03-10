package com.example.demo.constant;

/**
 * 前端定义code
 */
public final class ResponseConst {
  private ResponseConst(){}

  /**
   * 成功
   */
  public static final Integer SUCCESS = 200;

  /**
   * 服务器错误
   */
  public static final Integer SERVER_ERR = 500;

  public static final Integer BAD_REQUEST = 400;

  /**
   * 用户提示code
   */
  public static final Integer USER_ALTER_ERR = 1;

  /**
   * 前端错误code
   */
  public static final Integer FRONT_REQUEST_ERR = 2;

  /**
   * 用户需要重新登录code
   */
  public static final Integer USER_LOGOUT_ERR =3;
  /**
   * 相关数据有问题
   */
  public static final Integer DATA_ERR =4;

  public static final Integer USER_POPUP_ERR =4;
}
