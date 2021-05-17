package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * 不要对有@Configuration注解的配置类进行Field级的依赖注入。 会产生循环依赖
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {


    @Value("${url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, username, password);
    }

    // @Bean
    // @Bean(name = "store")
    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Store stringStore() {
        return new StringStore();
    }

    @Bean
    public StringStore stringStore1() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    /**
     * 会有循环依赖问题
     */
//    private final Store<String> s1;
//    private final Store<Integer> s2;
//
//    public StoreTest(Store<String> s1, Store<Integer> s2) {
//        this.s1 = s1;
//        this.s2 = s2;
//    }
//    @Bean(name = "stringStoreTest")
//    public StringStore stringStoreTest() {
//        return new StringStore();
//    }
}
