package com.gls.gemini.upms.boot.web.controller;

import cn.hutool.json.JSONUtil;
import com.aliyun.oss.model.Bucket;
import com.gls.gemini.common.core.support.LoginTemplate;
import com.gls.gemini.starter.aliyun.oss.support.OssTemplate;
import com.gls.gemini.upms.boot.kafka.KafkaProducer;
import com.gls.gemini.upms.boot.kafka.KafkaTopicConstants;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * demo数据 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/demo")
@Tag(name = "demo", description = "demo数据")
public class DemoController {

    @Resource
    private KafkaProducer kafkaProducer;
    @Resource
    private OssTemplate ossTemplate;
    @Resource
    private LoginTemplate<?, ?, ?, ?> loginTemplate;

    @Operation(summary = "kafkaDemo", description = "kafka发送消息")
    @PostMapping("/kafkaDemo")
    public DemoVo hello(@RequestBody DemoVo demoVo) {
        log.info("demoVo {}", JSONUtil.toJsonStr(demoVo));
        kafkaProducer.send(KafkaTopicConstants.TOPIC_TEST, JSONUtil.toJsonStr(demoVo));
        return demoVo;
    }

    @Operation(summary = "ossDemo", description = "oss测试")
    @PostMapping("/ossDemo")
    public String ossDemo() {
        return ossTemplate.getALlBucket().stream().map(Bucket::getName).collect(Collectors.joining(","));
    }

    @Operation(summary = "获取登录用户", description = "获取登录用户")
    @PostMapping("/getLoginUser")
    public String getLoginUser() {
        String loginUserName = loginTemplate.getLoginUserNickname().orElse("未登录");
        log.info("loginUser {}", loginUserName);
        return loginUserName;
    }
}