package com.wjx.springboot.config;

import com.wjx.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration注解：指明当前类是配置类；替代以前的Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器中添加组件了。。。");
        return new HelloService();
    }
}