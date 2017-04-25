package com.wdeng.spring.beanannotation.multibean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInvokerTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
    }

    @Test
    public void testMultBean() {
        BeanInvoker beanInvoker = (BeanInvoker) context.getBean("beanInvoker");
        beanInvoker.say();
    }
}