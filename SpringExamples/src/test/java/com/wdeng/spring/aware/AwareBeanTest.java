package com.wdeng.spring.aware;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AwareBeanTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-aware.xml");
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }

    @Test
    public void testMyApplicationContextAwareBean() {
        MyApplicationContextAwareBean bean = (MyApplicationContextAwareBean) context.getBean("myApplicationContextAwareBean");
        System.out.println("testMyApplicationContextAwareBean: " + bean.hashCode());
    }

    @Test
    public void testMyBeanNameAware() {
        //MyBeanNameAware bean = (MyBeanNameAware) context.getBean("myBeanNameAware");
        //System.out.println("testMyBeanNameAware: " + bean);
    }
}