package com.example.liyunhui.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task2 {
    /**
     * 表示每隔5秒打一次
     */
    @Scheduled(cron="*/5****?")
    public void proce(){
        System.out.println("我是计时任务2");
    }
}
