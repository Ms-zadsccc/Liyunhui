package com.example.liyunhui.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * 任务定时类u是的复合配方
 */
@Component
public class Task1 {
    /**
     * 表示没隔6秒打一次
     */
    @Scheduled(fixedDelay=6000)
    public void  proces(){
        System.out.println("我是计时任务1");
    }
}
