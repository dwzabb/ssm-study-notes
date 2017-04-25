package com.wdeng.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

//    @Bean
//    public MyDriverManager myDriverManager() {
//        return new MyDriverManager(url, username, password);
//    }
//
//
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope(value = "prototype")
//    public Store stringStore() {
//        return new StringStore();
//    }

    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore() {
        System.out.println("Creating Bean StringStore");
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        System.out.println("Creating Bean IntegerStore");
        return new IntegerStore();
    }

//    @Bean
//    public Store testGenericWire() {
//        System.out.println("s1: " + s1.getClass().getSimpleName());
//        System.out.println("s2: " + s2.getClass().getSimpleName());
//        return new StringStore();
//    }
}
