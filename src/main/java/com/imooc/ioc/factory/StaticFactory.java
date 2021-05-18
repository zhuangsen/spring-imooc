package com.imooc.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author madison
 * @description
 * @date 2021/5/18 22:57
 */
public class StaticFactory {

    private static Map<String, Person> persons = new HashMap();

    static {
        persons.put("tom", new Person("tom", 12));
        persons.put("jack", new Person("jack", 12));
    }

    //静态工厂方法。
    public static Person getPerson(String name) {
        return persons.get(name);
    }
}



