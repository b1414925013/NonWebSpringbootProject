package com.jfbian.model2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//带了prefix前缀就不能使用@Value
@ConfigurationProperties(prefix = "man")
public class Man {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woman{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}