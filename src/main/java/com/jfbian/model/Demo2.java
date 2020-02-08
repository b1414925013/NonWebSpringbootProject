package com.jfbian.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {

    @Value("${eee}")
    private String eee;

    public void name() {
        System.out.println("Demo2......name");
        System.out.println(eee);
    }

}
