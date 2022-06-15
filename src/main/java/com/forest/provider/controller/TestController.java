package com.forest.provider.controller;

import com.forest.provider.entity.HospitalInfo;
import com.forest.provider.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Forest
 * @date 2022/6/14 14:05
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/get")
    public String test () {
        return "I am provider port 3002";
    }

    @GetMapping("/findAll")
    public List<HospitalInfo> findAll() {
        return testService.selectAll();
    }
}
