package com.example;

import com.example.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/***
 * springboot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 */
@ImportResource(locations = {"classpath:beans.xml"})//导入spring配置文件，使其生效
@SpringBootTest
class SpringBootDemo01ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void testHelloService() {
       boolean b = ioc.containsBean("helloWorldService");
       boolean c = ioc.containsBean("helloWorldService");
       System.out.println(b);
       System.out.println(c);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
