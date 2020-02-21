package com.actionzh.spring_security_demo.controller;

import com.actionzh.spring_security_demo.domain.User;
import com.actionzh.spring_security_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @GetMapping("/401")
    public String accessDenied() {
        return "401";
    }

    @GetMapping("/user/common")
    public String common() {
        return "user/common";
    }

    @GetMapping("/user/admin")
    public String admin() {
        return "user/admin";
    }

    @GetMapping("/user/test")
    @ResponseBody
    public User test(@RequestParam String userName) {
        return userMapper.loadUserByUsername(userName);
    }

    public static void main(String[] args) {
        String encode = DigestUtils.md5DigestAsHex("m123".getBytes());
        System.out.println(encode);
    }

}