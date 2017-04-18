package com.wdeng.spring.autowiring;

public class AutoWireDAO {
    public void say(String arg) {
        System.out.println(this.getClass().getSimpleName() + ": " + arg);
    }
}
