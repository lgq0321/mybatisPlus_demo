package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:29
 */
@Configuration
public class TomcatConfig {
//    @Bean
//    TomcatServletWebServerFactory tomcatServletWebServerFactory() {
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory(){
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                constraint.addCollection(collection);
//                context.addConstraint(constraint);
//            }
//        };
//        factory.addAdditionalTomcatConnectors(createTomcatConnector());
//        return factory;
//    }
//    private Connector createTomcatConnector() {
//        Connector connector = new
//                Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8081);
//        connector.setSecure(false);
//        connector.setRedirectPort(8086);
//        return connector;
//    }
}