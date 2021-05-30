package com.imooc.source.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 执行顺序：构造方法 —> BeanPostProcessor的before —> init-method —> BeanPostProcessor的after。
 *
 * @author madison
 * @description
 * @date 2021/5/28 18:29
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    // 实例化、依赖注入完毕，在调用显示的初始化之前完成一些定制的初始化任务
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("======BeanPostProcessor before:" + beanName);
        return bean;
    }

    // 实例化、依赖注入、初始化完毕时执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=======BeanPostProcessor after:" + beanName);
        return bean;
    }
}
