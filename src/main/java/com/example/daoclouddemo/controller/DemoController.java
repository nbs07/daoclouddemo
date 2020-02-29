package com.example.daoclouddemo.controller;

import com.example.daoclouddemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("add")
    public String add(int a,int b){
        return "测试结果："+demoService.add(a, b);
    }
}
