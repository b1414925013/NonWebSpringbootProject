package com.jfbian.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @ClassName:  Demo3
 * @Description:配置类
 * @author: bianjianfeng
 * @date:   2020年2月4日 上午11:59:45
 */
@Component
public class Demo3 {
    @Value("${aaa}")
    public String aaa;
    @Value("${bbb}")
    public String bbb;
    @Value("${ccc}")
    public String ccc;
    @Value("${ddd}")
    public String ddd;
    @Value("${eee}")
    public String eee;
}
