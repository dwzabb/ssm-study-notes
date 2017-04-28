package com.wdeng.spring.aop.schema.advice;

import com.wdeng.spring.aop.schema.advice.biz.AspectBiz;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectBizTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-aop-schema-advice.xml");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        context.close();
    }

    @Test
    public void testAspect() {
        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.biz();
    }

    @Test
    public void testInit() {
        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.init("myService", 3);
    }

    @Test
    public void testAspectWithSelfNewObject() {
        // 自己new的对象不会执行切面操作，我的理解是自己new出来的对象不在Bean容器中，
        // 也就无法与aop的Bean相关联
        AspectBiz aspectBiz1 = new AspectBiz();
        aspectBiz1.biz();
    }

    @Test
    public void testFilter() {
        Fit fit = (Fit) context.getBean("aspectBiz");
        fit.filter();
    }
}