package com.learncode.myboot1.controller;

import com.learncode.myboot1.entity.User;
import com.learncode.myboot1.repository.UserRepository;
import com.learncode.myboot1.service.MQConsumerService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DemoController  {

    @Resource
    private UserRepository userRepository;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private MQConsumerService mqConsumerService;

    @RequestMapping("/")
    public String demo1()
    {
        return "hello world";
    }


    @RequestMapping("/a")
    public Object demo2()
    {
        List<String> mylist=new ArrayList<>();
        mylist.add("小明");
        mylist.add("小红");
        return  mylist;
    }

    @RequestMapping("/dba")
    public Object dba(){
        return userRepository.findAll();
    }

    @RequestMapping("/addUser")
    public Object addUser(@RequestParam(value="name", required = true) String name ){
        User user=new User();
        user.setName(name);
        userRepository.save(user);
        return user;
    }

    @RequestMapping("/search")
    public Object search(  ){
        Optional<User> user=userRepository.findById(3);
        user.get().setName("fadfa");
        return user;
    }

    @RequestMapping("thread")
    public Object thread(){
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                    //do something;
                    int a=0;
                    System.out.println(LocalDateTime.now()+"thread done!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread=new Thread(myRunnable);
        thread.start();
//        myRunnable.start();

        return LocalDateTime.now()+"hello";
    }

    @RequestMapping("/mqsend")
    public Object mqsend(  ){
        String ss="{\"memberId\":\"1231113\",\"memberPhone\":\"adsfasdf\",\"planeTicketInfo\":{\"orderPrice\":1509.000,\"vendorOrderId\":\"1016201804041601478580013190574\",\"num\":2,\"travelList\":[{\"travelName\":\"南京->北京\",\"departure\":\"南京\",\"destination\":\"北京\",\"flightCompany\":\"东方航空\",\"flightNumber\":\"MU2811\",\"flightStartTime\":\"2018-04-05 14:40:10\"," +
                "\"flightEndTime\":\"2018-04-05 18:40:10\",\"flightTimeDisplay\":\"cljfsjf\",\"flightInfoUrl\":\"http://www.baidu.com\"}]}}";
        jmsMessagingTemplate.convertAndSend("queue.fsh.ord.planeticket.book",ss);
        return "mqsend";
    }



    @RequestMapping("/recived")
    public Object recived(  ){
        mqConsumerService.receive();
        return mqConsumerService.receive();
    }







}
