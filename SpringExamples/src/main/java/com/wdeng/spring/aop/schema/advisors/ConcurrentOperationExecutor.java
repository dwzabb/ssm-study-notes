package com.wdeng.spring.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.PessimisticLockingFailureException;

public class ConcurrentOperationExecutor {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;

    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttempts++;
            System.out.println("Try times " + numAttempts);
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        } while (numAttempts < maxRetries);
        System.out.println("Try error: " + numAttempts);
        throw lockingFailureException;
    }
}
