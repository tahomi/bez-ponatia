package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Test Dima";
    }

    @GetMapping("/hi")
    public String hi(){ return "<h1 style='color: red'>Dima pidor</h1>"; }


}
