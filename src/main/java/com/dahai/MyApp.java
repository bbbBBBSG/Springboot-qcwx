package com.dahai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.dahai.*")
@SpringBootApplication
@EnableScheduling  // 开启定时任务
public class MyApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
        System.out.println("启动成功");
    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
