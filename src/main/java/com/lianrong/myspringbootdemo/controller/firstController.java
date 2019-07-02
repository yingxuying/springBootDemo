package com.lianrong.myspringbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class firstController {
    // 对下面的变量进行注入，让在springboot启动时就可以直接的去使用
    // @Value的注解用意是springboot启动时，自动扫描yml配置文件，将对应的key注入进来
    @Value("${mall.config.name}")
    private String name;
    @Value("${mall.config.description}")
    private String description;
    @Value("${mall.config.hot-sales}")
    private Integer hotSales;
    @Value("${mall.config.show-advert}")
    private Boolean showAdvert;

    @RequestMapping("/info")
    @ResponseBody
    public String info() {
        return String.format("name:%s,description:%s,hot-sales:%s,show-advert:%s", name, description, hotSales, showAdvert);
    }


    // 当增加了@RequestMapping和@ResponseBody后，out方法就和url里的/out地址绑定在了一起
    @RequestMapping("/out")
    @ResponseBody  // @ResponseBody会将返回的Success字符串原样的输出到客户端的浏览器上
    public String out() {
        return "Success";
    }
}
