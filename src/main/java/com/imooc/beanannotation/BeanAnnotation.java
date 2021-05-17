package com.imooc.beanannotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope
@Scope(value="singleton")
//@Scope(value = "prototype")
@Component
//@Component("bean")
public class BeanAnnotation {

    Log log = LogFactory.getLog(this.getClass());

    public void say(String arg) {
        log.debug("BeanAnnotation : " + arg);
    }

    public void myHashCode() {
        log.debug("BeanAnnotation : " + this.hashCode());
    }
}
