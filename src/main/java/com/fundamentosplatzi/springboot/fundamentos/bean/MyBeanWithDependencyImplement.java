package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("We've entered to method printWithDependency");
        int number = 1;
        System.out.println(myOperation.sum(number));
        LOGGER.debug("The number sent as parameter to dependency it's: " + number);
        System.out.println("Hello from implement of Bean with dependency");
    }
}
