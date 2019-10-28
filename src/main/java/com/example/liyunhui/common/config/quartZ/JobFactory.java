package com.example.liyunhui.common.config.quartZ;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 *
 * 这个配置主要用于第一个配置，在第一个配置中需要注入这个文件
 * ，这个文件主要是注入AutowireCapableBeanFactory 这个类
 * ，不然你在实现类（就是一个继承job的类，下面会贴）中是没办法
 * 注入其他service或者其他东西。
 */
@Component
public class JobFactory extends AdaptableJobFactory {
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;

    @Override
    protected Object createJobInstance( TriggerFiredBundle bundle) throws Exception {
        // 调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        // 进行注入
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}