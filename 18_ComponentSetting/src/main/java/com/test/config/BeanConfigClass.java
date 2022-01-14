package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

// bean 등록을 위한 패키지 스캔 설정
@ComponentScan(basePackages = {"com.test.beans"})
public class BeanConfigClass {

}
