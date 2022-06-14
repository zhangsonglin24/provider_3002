package com.forest.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest
 * @date 2022/6/14 14:05
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String test () {
        return "I am provider port 3002";
    }
}
