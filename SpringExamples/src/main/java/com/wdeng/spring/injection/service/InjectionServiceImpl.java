package com.wdeng.spring.injection.service;

import com.wdeng.spring.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDAO injectionDAO;

    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数: " + arg);
        arg = arg + this.hashCode();
        injectionDAO.save(arg);
    }
}
