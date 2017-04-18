package com.wdeng.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameAware implements BeanNameAware{
    @Override
    public void setBeanName(String s) {
        System.out.println("MyBeanNameAware: " + s);
    }
}
