package com.jfbian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.jfbian.model.Demo1;
import com.jfbian.model.Demo2;
import com.jfbian.model.Demo3;
import com.jfbian.model2.Man;
import com.jfbian.model2.Woman;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        //第一种方式
        //SpringApplication.run(App.class, args);
        //第二种方式
        new SpringApplicationBuilder().sources(App.class).web(WebApplicationType.NONE).run(args);
    }

    @Value("${aaa}")
    private String aaa;
    @Value("${bbb}")
    private String bbb;
    @Value("${ccc}")
    private String ccc;
    @Value("${ddd}")
    private String ddd;

    @Autowired
    private Demo1 demo1;
    @Autowired
    private Demo2 demo2;
    @Autowired
    private Demo3 demo3;
    @Autowired
    private Woman woman;
    @Autowired
    private Man man;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hahahahaah");
        System.out.println(aaa + bbb + ccc + ddd);
        System.out.println("-----------------------");
        demo1.name();
        demo2.name();
        System.out.println(demo3.aaa);
        System.out.println(demo3.bbb);
        System.out.println(demo3.ccc);
        System.out.println(demo3.ddd);
        System.out.println(demo3.eee);
        System.out.println("-----------------------");
        System.out.println(woman.getAge());
        System.out.println(woman.getName());
        System.out.println("-----------------------");
        System.out.println(man.getAge());
        System.out.println(man.getName());
    }
}
