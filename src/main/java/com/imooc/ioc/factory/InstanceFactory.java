package com.imooc.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author madison
 * @description 实例工厂，需要创建工厂本身，再调用工厂的实例(对象)方法来返回需要的对象本身。
 * @date 2021/5/18 22:57
 */
public class InstanceFactory {

    private Map<String, Person> persons;

    public InstanceFactory() {
        persons = new HashMap();
        persons.put("haha", new Person("haha", 18));
        persons.put("xixi", new Person("xixi", 18));
    }

    public Person getPerson(String name) {
        return persons.get(name);
    }
}
