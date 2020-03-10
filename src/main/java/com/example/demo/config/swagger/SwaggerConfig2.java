package com.example.demo.config.swagger;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig2 {
//  /**
//   * 定义分隔符,配置Swagger多包
//   */
//  private static final String SPLIT = ";";
//
////  @Bean
////  public Docket createRestApiDoc3() {
////    return new Docket(DocumentationType.SWAGGER_2)
////            .groupName("外呼系统接口")
////            .apiInfo(apiInfo())
////            .select()
////            .apis(RequestHandlerSelectors.basePackage("com.sishu.call"))
////            .paths(PathSelectors.any())
////            .build()
////            .genericModelSubstitutes(Optional.class)
////            .securitySchemes(newArrayList(apiKeys()))
////            .securityContexts(newArrayList(securityContext()));
////  }
//
//  @Bean
//  public Docket createRestApiDoc4() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .groupName("统计报表")
//            .apiInfo(apiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//            .paths(PathSelectors.any())
//            .build()
//            .genericModelSubstitutes(Optional.class)
//            .securitySchemes(newArrayList(apiKeys()))
//            .securityContexts(newArrayList(securityContext()));
//  }
//
//  /**
//   * 重写basePackage方法，使能够实现多包访问，复制贴上去
//   */
//  public static Predicate<RequestHandler> basePackage(final String basePackage) {
//    return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
//  }
//
//  private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
//    return input -> {
//      // 循环判断匹配
//      for (String strPackage : basePackage.split(SPLIT)) {
//        boolean isMatch = input.getPackage().getName().startsWith(strPackage);
//        if (isMatch) {
//          return true;
//        }
//      }
//      return false;
//    };
//  }
//
//  private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
//    return Optional.fromNullable(input.declaringClass());
//  }
//
//  private List<ApiKey> apiKeys() {
//    ApiKey sstt = new ApiKey("企业", "SSTT", "header");
//    ApiKey ssat = new ApiKey("token", "SSAT", "header");
//    ApiKey ssto = new ApiKey("机构", "SSTO", "header");
//    ApiKey platform = new ApiKey("平台", "platform", "header");
//    return Arrays.asList(sstt, ssat, ssto, platform);
//  }
//
//
//  private List<SecurityContext> securityContext() {
//    List<SecurityContext> securityContexts = new ArrayList<>();
//    securityContexts.add(
//            SecurityContext
//                    .builder()
//                    .securityReferences(defaultAuth())
//                    .build());
//    return securityContexts;
//  }
//
//  private List<SecurityReference> defaultAuth() {
//    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//    authorizationScopes[0] = authorizationScope;
//
//    List<SecurityReference> securityReferences = new ArrayList<>();
//    // 与定义的apiKeys中name保持一致。
//    securityReferences.add(new SecurityReference("企业", authorizationScopes));
//    securityReferences.add(new SecurityReference("token", authorizationScopes));
//    securityReferences.add(new SecurityReference("机构", authorizationScopes));
//    securityReferences.add(new SecurityReference("平台", authorizationScopes));
//    return securityReferences;
//  }
//
//  private ApiInfo apiInfo() {
//    return new ApiInfoBuilder()
//            .title("sigmayun - 公共模块 API")
//            .description("----------------------------")
//            .version("1.0")
//            .build();
//  }
//
//  @Bean
//  public Docket createRestApi() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .apiInfo(apiInfo())
//            .select()
//            //加了ApiOperation注解的类，才生成接口文档
//            .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
//            //包下的类，才生成接口文档
//            //.apis(RequestHandlerSelectors.basePackage("io.renren.controller"))
//            .paths(PathSelectors.any())
//            .build();
//  }
//
//  private ApiInfo apiInfo() {
//    return new ApiInfoBuilder()
//            .title("application-workOrder")
//            .description("api文档")
//            .version("1.0.0")
//            .build();
//  }

}
