package com.example.demo.Controller;

import com.example.demo.Dto.User;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hell()
    {
        User user =new User();
        user.email="xuedagong@qq.com";
        user.username="xue";
        return user;
    }
}
