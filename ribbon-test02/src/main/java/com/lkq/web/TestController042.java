package com.lkq.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController042 {


    @RequestMapping("test01")
    public String test(String name){

        System.out.println("======name======"+name);

        return "test042-ok";
    }


}
