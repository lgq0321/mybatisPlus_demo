package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.desktop.AppHiddenEvent;
import java.awt.desktop.AppHiddenListener;

@SpringBootApplication
//@ComponentScan("com.example.demo.*.*")
public class DemoApplication implements CommandLineRunner, AppHiddenListener {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        ConfigurableApplicationContext context =
//        MyConfig myConfig = (MyConfig)context.getBean("myConfig");
//        System.out.println(myConfig.toString());
//        myConfig.getServers().forEach(System.out::println);
//        RedisConfig redisConfig = (RedisConfig)context.getBean("redisConfig");
//        redisConfig.getRedisConfigs().forEach(redisSetting -> {
//            System.out.println(redisSetting.getPort());
//            System.out.println(redisSetting.getHost());
//        });

//        HelloEntity helloEntity = context.getBean(HelloEntity.class);
//        System.out.println(helloEntity.sayHello());
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello spring boot!");
    }

    @Override
    public void appHidden(AppHiddenEvent e) {

    }

    @Override
    public void appUnhidden(AppHiddenEvent e) {

    }
}
