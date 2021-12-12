package com.donghyeob.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.donghyeob.restapi.domain.ResultVO;

@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello test";
    }
    
    @GetMapping("/hello2")
    public String hello2() {
    	return "Hello test2";
    }
    
    @GetMapping("/hello3")
    public String hello3(@RequestParam("name") String name) {
    	return "Hello " + name;
    }
    
    @PostMapping("/hello4")
    public String hello4(@RequestParam String name) {
        return "Hello " + name;
    }
    
    @PostMapping("/hello5")
    public ResultVO hello5(@RequestParam("name") String name) {
        ResultVO result = new ResultVO(0, name);
        return result;
    }
}
