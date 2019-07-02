package com.lianrong.myspringbootdemo.controller;

import com.lianrong.myspringbootdemo.dao.UserRepository;
import com.lianrong.myspringbootdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserRepository userRepository;

    @ResponseBody
    @GetMapping("/one") // @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
    public User getUser(String uuid) {
        User user = userRepository.findByUuid(uuid);
        return userRepository.findByUuid(uuid);
    }
}
