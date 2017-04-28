package com.wdeng.spring.aop.schema.advisors.service;

import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
    public void invoke() {
        System.out.println("InvokeService invoke()");
    }

    public void invokeException() {
        throw new PermissionDeniedDataAccessException("invokeException", new RuntimeException());
    }
}
