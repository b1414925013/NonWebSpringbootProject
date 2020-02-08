package com.jfbian.model2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//带了prefix前缀就不能使用@Value
//@ConfigurationProperties(prefix = "woman")
//可以放在config目录下
//@PropertySource(value = { "classpath:config/woman.properties" })
@PropertySource(value = {"classpath:woman.properties"})
public class Woman {
    @Value("${woman.name}")
    private String name;
    @Value("${woman.age}")
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