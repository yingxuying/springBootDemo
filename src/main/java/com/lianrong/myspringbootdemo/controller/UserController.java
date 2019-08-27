package com.lianrong.myspringbootdemo.controller;

import com.lianrong.myspringbootdemo.dao.UserRepository;
import com.lianrong.myspringbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource // @Resource注解由J2EE提供，需要导入包javax.annotation.Resource。默认按照ByName自动注入
    private UserRepository userRepository;

    // bean是单例
    // @Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired。
    // @Autowired 采取的策略为按照类型注入

    @ResponseBody
    @GetMapping("/one") // @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
    public User getUser(String uuid) {
        User user = userRepository.findByUuid(uuid);
        return userRepository.findByUuid(uuid);
    }
}
