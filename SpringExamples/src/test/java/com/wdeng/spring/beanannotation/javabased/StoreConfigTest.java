package com.wdeng.spring.beanannotation.javabased;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StoreConfigTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void testJavaBasedConfig() {
        Store store = (Store) context.getBean("stringStore");
        System.out.println(store.hashCode());

        store = (Store) context.getBean("stringStore");
        System.out.println(store.hashCode());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager myDriverManager = (MyDriverManager) context.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getSimpleName());
    }

    @Test
    public void testGenericAutoWired() {
        Store store = (Store) context.getBean("testGenericWire");
    }
}