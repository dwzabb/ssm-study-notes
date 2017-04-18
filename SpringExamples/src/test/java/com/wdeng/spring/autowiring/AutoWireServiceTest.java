package com.wdeng.spring.autowiring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AutoWireServiceTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-autowire.xml");
    }

    @Test
    public void say() throws Exception {
        AutoWireService service = (AutoWireService) context.getBean("autoWireService");
        service.say("Say something");
    }

}