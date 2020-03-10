package com.example.demo.context;

import com.alibaba.ttl.TransmittableThreadLocal;


/**
 * 上下文独立实现
 */
public final class SystemContextHolder {

  private SystemContextHolder(){}

  private static final TransmittableThreadLocal<SystemContext> context = new TransmittableThreadLocal<>();

  public static SystemContext get() {
    return context.get();
  }

  /**
   * 只更新非null字段
   */
  public static void set(SystemContext value) {
    context.set(value);
  }

  public static void remove() {
    context.remove();
  }
}
