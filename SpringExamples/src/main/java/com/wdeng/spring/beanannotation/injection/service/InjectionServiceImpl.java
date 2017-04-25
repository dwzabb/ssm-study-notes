package com.wdeng.spring.beanannotation.injection.service;

import com.wdeng.spring.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
    private InjectionDAO injectionDAO;

    @Autowired
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
