package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.AuthorizationConsentInfoService;
import com.gls.gemini.upms.sdk.feign.AuthorizationConsentInfoFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationConsentInfoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 授权同意信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/authorizationConsentInfo")
@Tag(name = "authorizationConsentInfo", description = "授权同意信息表")
public class AuthorizationConsentInfoController extends BaseController<AuthorizationConsentInfoService, AuthorizationConsentInfoVo> implements AuthorizationConsentInfoFeign {
}