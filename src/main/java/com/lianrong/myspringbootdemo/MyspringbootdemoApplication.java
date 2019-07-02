package com.lianrong.myspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 说明这是一个SpringBoot应用的入口类
public class MyspringbootdemoApplication { // 入口类的名称是工程名+application，驼峰写法
    // 类的入口方法
    // run方法，参数将入口类的类传进去，启动SpringBoot应用
    public static void main(String[] args) {
        SpringApplication.run(MyspringbootdemoApplication.class, args);
    }

}
