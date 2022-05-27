package com.java_ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class NewsController {
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String UserInfo(@RequestParam Map<String, Object> params) {
        return "<h1>name:"+params.get("name")+"</h1>"+"<h1>age:"+params.get("age")+"</h1>";
    }
    @PostMapping("/usermodal")
    public String UserModal(@RequestParam("name") String name,@RequestParam("age") String age){
        return "name："+name+"</br>"+"age"+age;
    }
}
