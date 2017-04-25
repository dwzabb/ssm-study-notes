package com.wdeng.spring.beanannotation.javabased;

public class StringStore implements Store<String> {
    public void init() {
        System.out.println("Initializing StringStore");
    }

    public void destroy() {
        System.out.println("Destroying StringStore");
    }


}
