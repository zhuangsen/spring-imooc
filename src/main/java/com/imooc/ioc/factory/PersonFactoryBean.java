package com.imooc.ioc.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author madison
 * @description
 * @date 2021/5/18 22:59
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    private String personName;

    public void setPersonName(String name) {
        this.personName = name;
    }

    @Override
    public Person getObject() throws Exception {
        // TODO Auto-generated method stub
        return new Person(personName, 30);
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Person.class;
    }


    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return true;
    }
}
