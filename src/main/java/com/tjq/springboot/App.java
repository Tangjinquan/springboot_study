/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: App
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/4/13	       Tyson	               初次做成
 * =============================================================
 */
package com.tjq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/4/13下午6:09
 */
@SpringBootApplication
public class App {

    @Bean
    public Runnable createRunable() {
        return () -> {
            System.out.println("Spring boot is run ");
        };
    }

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//        HashSet<Object> objects = new HashSet<>();
//        objects.add(Factory.class);
//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setSources(objects);
        SpringApplication springApplication = new SpringApplication(Factory.class);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println(context.getBean(User.class));


    }
}
