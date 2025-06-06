package com.inlym.lab.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基本使用演示控制器
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 2025.06.07
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
