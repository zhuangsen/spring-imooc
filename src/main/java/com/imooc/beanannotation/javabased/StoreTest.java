package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author madison
 * @description
 * @date 2021/5/17 22:44
 */
//@Component("storeTest")
@Component()
public class StoreTest {

//    @Autowired
//    private Store<String> s1;
//    @Autowired
//    private Store<Integer> s2;

    private final Store<String> s1;
    private final Store<Integer> s2;

    public StoreTest(Store<String> s1, Store<Integer> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void test(){
        System.out.println("s1 : " + s1.getClass().getName());
        System.out.println("s2 : " + s2.getClass().getName());
    }
}
