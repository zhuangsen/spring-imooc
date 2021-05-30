package com.imooc.source.beanPostProcessor;

/**
 * @author madison
 * @description
 * @date 2021/5/28 18:14
 */
public class User {
    private String name;
    private String age;

    void init() {
        System.out.println("init");
//        name = "zx-init";
//        age = "zx-init";
        System.out.println("name:" + name + ",age:" + age);
    }

    /**
     * 可以看到程序先执行后置器将值改为20，然后执行的构造方法，改为zx-construtor，但是最终age的值为20，
     * 到这里疑问就来了，为什么后执行的赋值没起作用呢？这个我后面解读源码的时候再聊。
     */
    public User() {
        System.out.println("constructor");
        name = "zx-construtor";
        age = "zx-construtor";
        System.out.println("name:" + name + ",age:" + age);
    }

    public void go() {
        System.out.println("age:" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
