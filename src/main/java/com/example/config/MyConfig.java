package com.example.config;

import com.example.controller.HelloWorldController;
import com.example.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *@Configuration:指明，这是一个配置类,替代spring配置文件
 *
 *在配置文件中用<bean><bean/>标签添加组件
 */

@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloWorldService helloWorldService(){
        return new HelloWorldService();
    }

}
