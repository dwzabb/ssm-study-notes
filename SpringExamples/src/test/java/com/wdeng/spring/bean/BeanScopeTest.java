package com.wdeng.spring.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanScopeTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-bean-scope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = (BeanScope) context.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = (BeanScope) context.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2() {
        BeanScope beanScope = (BeanScope) context.getBean("beanScope");
        beanScope.say();
    }
}