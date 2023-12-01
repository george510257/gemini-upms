package com.gls.gemini.upms.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * upms启动类
 */
@SpringBootApplication
public class UpmsBootApplication {
    /**
     * upms启动入口
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(UpmsBootApplication.class, args);
    }
}