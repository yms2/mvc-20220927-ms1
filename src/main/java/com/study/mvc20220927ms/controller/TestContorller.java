package com.study.mvc20220927ms.controller;

import com.study.mvc20220927ms.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {
    @Autowired
    @Qualifier("ts1")
    //자동으로 찾아서 주입하라는 명령어
    private TestService testService;



    @GetMapping("/test")
    public String run(){
        testService.logic1();
        return "DI_Ioc 수업";
    }
}
