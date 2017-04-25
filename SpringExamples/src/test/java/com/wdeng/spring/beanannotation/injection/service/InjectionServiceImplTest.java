package com.wdeng.spring.beanannotation.injection.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class InjectionServiceImplTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
    }

    @Test
    public void testAutowire() {
        InjectionService injectionService = (InjectionService) context.getBean("injectionServiceImpl");
        injectionService.save("This is autowired");
    }
}