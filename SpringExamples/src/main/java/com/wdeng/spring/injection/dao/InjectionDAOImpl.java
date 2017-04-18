package com.wdeng.spring.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String arg) {
        System.out.println("保存数据: " + arg);
    }
}
