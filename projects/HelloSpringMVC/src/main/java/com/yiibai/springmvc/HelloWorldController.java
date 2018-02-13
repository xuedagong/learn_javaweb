package com.yiibai.springmvc;

import com.yiibai.springmvc.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HelloWorldController {

    @Resource
    private TaskService taskService;
 
    @RequestMapping("/hello")
    public String hello(Model model) {
         
        model.addAttribute("greeting", "Hello Spring MVC,this is a");
         
        return"helloworld";
         
    }


    @RequestMapping("/hello1")
    public String hello2(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC,this is a");
        taskService.test();
        return"helloworld";

    }
 
}