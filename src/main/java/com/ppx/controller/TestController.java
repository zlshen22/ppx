package com.ppx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlshen
 * @create 2020-12-04 19:58
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "测试 test";
    }
}
