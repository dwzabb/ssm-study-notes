package com.wdeng.spring.beanannotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanAnnotationTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
    }

    @Test
    public void testSay() {
        BeanAnnotation bean = (BeanAnnotation) context.getBean("beanAnnotation");
        bean.say("说点什么");
    }

    @Test
    public void testScope() {
        BeanAnnotation bean = (BeanAnnotation) context.getBean("beanAnnotation");
        bean.myHashCode();

        bean = (BeanAnnotation) context.getBean("beanAnnotation");
        bean.myHashCode();
    }
}