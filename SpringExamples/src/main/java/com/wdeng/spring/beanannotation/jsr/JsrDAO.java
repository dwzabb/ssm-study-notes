package com.wdeng.spring.beanannotation.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDAO {
    public void save(String arg) {
        System.out.println("储存数据: " + arg);
    }
}
