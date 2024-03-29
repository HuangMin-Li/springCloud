package com.xk.controller;

import com.xk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getUser/{id}")
    public User getUser( @PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8078/getProvider/"+id,User.class);
    }
}
