package com.marcosoft.labone.controller;

import com.marcosoft.labone.service.MathService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math2")
@AllArgsConstructor
public class Math2Controller {

    private MathService mathService;

    @GetMapping("/add")
    public String add(@RequestParam int x, @RequestParam int y){
        return mathService.add(x,y).toString();
    }
}
