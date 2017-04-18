package com.wdeng.spring.autowiring;

public class AutoWireService {
    private AutoWireDAO autoWireDAO;

    public AutoWireService(AutoWireDAO autoWireDAO) {
        System.out.println("AutoWireService constructor");
        this.autoWireDAO = autoWireDAO;
    }

    public void setAutoWireDAO(AutoWireDAO autoWireDAO) {
        System.out.println("setAutoWireDAO");
        this.autoWireDAO = autoWireDAO;
    }

    public void say(String arg) {
        autoWireDAO.say(arg);
    }
}
