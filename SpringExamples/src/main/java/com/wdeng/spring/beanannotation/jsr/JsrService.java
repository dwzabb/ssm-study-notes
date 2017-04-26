package com.wdeng.spring.beanannotation.jsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

    //@Autowired
    @Resource
    private JsrDAO jsrDAO;

    @PostConstruct
    public void init() {
        System.out.println("JsrService init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService destroy()");
    }

    public void save(String arg) {
        jsrDAO.save(arg);
    }
}
