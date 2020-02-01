package com.edu.jeninstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/get")
    public String test(){
        return "hello ruanxk,you are the best! Take everything easy!";
    }
}
