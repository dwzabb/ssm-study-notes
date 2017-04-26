package com.wdeng.spring.beanannotation.jsr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class JsrServiceTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        context.close();
    }

    @Test
    public void testJsr() {
        JsrService service = (JsrService) context.getBean("jsrService");
        service.save("重要信息");
    }

    @Test
    public void testAppContext() {
        /* 虽然我们没有尝试获取任何Bean，但是我们仍然能看到
        Creating Bean StringStore
        Creating Bean IntegerStore
        JsrService init()
        JsrService destroy()
        等输出，说明只要容器启动，就会加载这些相应的配置，因为这些配置都在spring-beanannotation.xml的component-scan的
        范围内
         */
        System.out.println("test");
    }
}