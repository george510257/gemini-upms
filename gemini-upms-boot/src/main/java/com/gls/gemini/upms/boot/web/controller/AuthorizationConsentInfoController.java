package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.common.core.enums.ResultEnums;
import com.gls.gemini.upms.boot.web.service.AuthorizationConsentInfoService;
import com.gls.gemini.upms.sdk.feign.AuthorizationConsentInfoFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationConsentInfoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    /**
     * 根据客户端id和用户id查询授权同意信息
     *
     * @param clientId 客户端id
     * @param userId   用户id
     * @return 授权同意信息
     */
    @GetMapping("/findByClientIdAndUserId/{clientId}/{userId}")
    @Override
    public Result<AuthorizationConsentInfoVo> findByClientIdAndUserId(@PathVariable("clientId") Long clientId, @PathVariable("userId") Long userId) {
        return ResultEnums.SUCCESS.getResult(this.service.findByClientIdAndUserId(clientId, userId));
    }
}