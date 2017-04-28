package com.wdeng.spring.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void preProcess() {
        System.out.println("MyAspect preProcess()");
    }

    public void afterReturning() {
        System.out.println("MyAspect afterReturning()");
    }

    public void afterThrowing() {
        System.out.println("MyAspect afterThrowing");
    }

    public void after() {
        System.out.println("MyAspect after()");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MyAspect around() 1");
        Object retVal = pjp.proceed();
        System.out.println("MyAspect around() 2");
        return retVal;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) throws Throwable {
        System.out.println("MyAspect aroundInit() bizName: " + bizName + "   times: " + times);
        System.out.println("MyAspect aroundInit() 1");
        Object retVal = pjp.proceed();
        System.out.println("MyAspect aroundInit() 2");
        return retVal;
    }
}
