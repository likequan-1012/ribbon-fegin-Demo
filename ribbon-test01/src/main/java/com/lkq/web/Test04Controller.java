package com.lkq.web;

import com.lkq.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test04Controller {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test02")
    public String test(){
        for (int i=0;i<10;i++){
            testApi.test01("冷藏柜");
        }
        return "ok";
    }

}
