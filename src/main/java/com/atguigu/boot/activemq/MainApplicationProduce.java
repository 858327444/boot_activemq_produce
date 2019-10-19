package com.atguigu.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 主启动类
 * Program Name: activemq
 * Created by yanlp on 2019-10-19
 *
 * @author yanlp
 * @version 1.0
 */
@SpringBootApplication
@EnableScheduling
public class MainApplicationProduce {
    public static void main(String[] args) {
        SpringApplication.run(MainApplicationProduce.class,args);
    }
}
