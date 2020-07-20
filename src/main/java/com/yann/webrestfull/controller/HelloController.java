package com.yann.webrestfull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

//    @RequestMapping("/")
//    public String index(){return "index";}

    @RequestMapping("/success")
    //templates/success.html
    public String success(Map<String, Object> map) {
        map.put("hello", "Yann");
        return "success";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
