package com.jfbian.model;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class Demo1 {

    public void name() {
        log.info("hahaha我是@Log4j输出内容--------------------------------------------------------------");
        System.out.println("Demo1......name");
        log.info("hahaha我是@Log4j输出内容--------------------------------------------------------------");
    }
}
