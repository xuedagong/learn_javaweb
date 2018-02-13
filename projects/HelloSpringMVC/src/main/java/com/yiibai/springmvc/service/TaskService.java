package com.yiibai.springmvc.service;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

@Service
public class TaskService {

    @Resource
    private TaskExecutor thisTask;

    public void test()
    {
        thisTask.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random random=new Random();
                System.out.println("helo74522"+random.doubles().toString() );
            }
        });
        System.out.println(312);
    }
}
