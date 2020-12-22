package com.ayang.nc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @ClassName TestController
 * @Author ayang
 * @Date 2020/9/27
 * @Version V1.0
 * @description
 **/
@RequestMapping("test")
@RestController
public class TestController {

    @Value("${test.content}")
    private String content;

    @RequestMapping("content")
    public String testProfile() {
        return LocalDateTime.now().toString() + "-----" + content;
    }

}
