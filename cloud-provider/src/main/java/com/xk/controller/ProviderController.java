package com.xk.controller;

import com.xk.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping(value = "/getProvider/{id}")
    public User getUser(@PathVariable Long id){
        User user=new User();
        user.setId(id);
        user.setName("张三");
        return user;
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "张三";
    }
}
