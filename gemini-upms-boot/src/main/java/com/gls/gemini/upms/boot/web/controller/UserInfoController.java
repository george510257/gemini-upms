package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.UserInfoService;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Slf4j
@RestController
@RequestMapping("/userInfo")
@Tag(name = "userInfo", description = "用户信息表")
public class UserInfoController extends BaseController<UserInfoService, UserInfoVo> {
}