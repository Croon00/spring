package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.test.beans")
@ComponentScan(basePackages = "com.test.advisor")
// AOP 관련 설정을 어노테이션으로 하는 것을 허용한다.
@EnableAspectJAutoProxy
public class BeanConfigClass {

}
