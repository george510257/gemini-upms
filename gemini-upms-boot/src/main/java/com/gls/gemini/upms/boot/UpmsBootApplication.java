package com.gls.gemini.upms.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Gemini UPMS启动类
 */
@SpringBootApplication
public class UpmsBootApplication {
    /**
     * Gemini UPMS启动入口
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(UpmsBootApplication.class, args);
    }
}