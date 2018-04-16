/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Factory
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/4/13	       Tyson	               初次做成
 * =============================================================
 */
package com.tjq.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/4/13下午6:15
 */
@SpringBootApplication
public class Factory {
    @Bean
    public User createUser() {
        return new User();
    }

}
