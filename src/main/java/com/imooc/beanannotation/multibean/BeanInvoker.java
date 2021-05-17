package com.imooc.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

//    @Autowired
//    private List<BeanInterface> list;

//    @Autowired
//    private Map<String, BeanInterface> map;

//    @Autowired
//    @Qualifier("beanImplTwo")
//    private BeanInterface beanInterface;


    // spring 推荐注入方式
    private final List<BeanInterface> list;
    private final Map<String, BeanInterface> map;
    private final BeanInterface beanInterface;

    public BeanInvoker(List<BeanInterface> list, Map<String, BeanInterface> map,@Qualifier("beanImplTwo") BeanInterface beanInterface) {
        this.list = list;
        this.map = map;
        this.beanInterface = beanInterface;
    }

    public void say() {
        if (null != list && 0 != list.size()) {
            System.out.println("list...");
            for (BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> list is null !!!!!!!!!!");
        }

        System.out.println();

        if (null != map && 0 != map.size()) {
            System.out.println("map...");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null !!!!!!!!!!");
        }

        System.out.println();
        if (null != beanInterface) {
            System.out.println(beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null...");
        }

    }
}
