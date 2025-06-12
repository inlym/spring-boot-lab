package com.inlym.lab.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示控制器
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0
 **/
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}
