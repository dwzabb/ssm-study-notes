package com.wdeng.spring.resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MyResourceTest {

    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-resource.xml");
    }

    @Test
    public void resource() throws Exception {
        MyResource myResource = (MyResource) context.getBean("myResource");
        myResource.resource();
    }

}