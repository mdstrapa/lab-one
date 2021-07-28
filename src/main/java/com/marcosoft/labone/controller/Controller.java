package com.marcosoft.labone.controller;

import com.marcosoft.labone.service.MathService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @Autowired
    private MathService mathService;

    @GetMapping("/")
    public String index(){
        String someValue = "Helloween";

        String anotherValue = "Dream";

        log.info("I can not {} believe {}",someValue, anotherValue);

        log.error("This is an error");

        return "Hello universe.";
    }

    @GetMapping("/add")
    public String add(@RequestParam int x,@RequestParam int y){

        return mathService.add(x,y).toString();

    }

}
