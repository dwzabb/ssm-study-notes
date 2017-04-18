package com.wdeng.spring.lifecycle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanLifeCycleTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-life-cycle.xml");
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }

    @Test
    public void testBeanLifeCycle() {
        context.getBean("beanLifeCycle");
    }
}
