package com.imooc.autowiring;

public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;
    private AutoWiringOtherDAO autoWiringOtherDAO;
    private AutoWiringOtherDAO autoWiringOtherDAO1;

    public AutoWiringService() {
        System.out.println("default constructor AutoWiringService");
    }

    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        System.out.println("constructor AutoWiringService");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setAutoWiringDAO");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void setAutoWiringOtherDAO(AutoWiringOtherDAO autoWiringOtherDAO) {
        System.out.println("setAutoWiringOtherDAO");
        this.autoWiringOtherDAO = autoWiringOtherDAO;
    }

    public void setAutoWiringOtherDAO1(AutoWiringOtherDAO autoWiringOtherDAO1) {
        System.out.println("setAutoWiringOtherDAO1");
        this.autoWiringOtherDAO1 = autoWiringOtherDAO1;
    }


    public void say(String word) {
        this.autoWiringDAO.say(word);
        this.autoWiringOtherDAO.say(word);
    }
}
