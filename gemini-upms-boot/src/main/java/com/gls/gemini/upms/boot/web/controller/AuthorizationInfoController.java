package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.common.core.enums.ResultEnums;
import com.gls.gemini.upms.boot.web.service.AuthorizationInfoService;
import com.gls.gemini.upms.sdk.feign.AuthorizationInfoFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 授权信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/authorizationInfo")
@Tag(name = "authorizationInfo", description = "授权信息表")
public class AuthorizationInfoController extends BaseController<AuthorizationInfoService, AuthorizationInfoVo> implements AuthorizationInfoFeign {

    /**
     * 根据token获取授权信息
     *
     * @param token token
     * @return 授权信息
     */
    @Operation(summary = "根据token获取授权信息", description = "根据token 获取授权信息")
    @PostMapping("/getByToken")
    @Override
    public Result<List<AuthorizationInfoVo>> getByToken(String token) {
        return ResultEnums.SUCCESS.getResult(this.service.getByToken(token));
    }

    @Operation(summary = "保存", description = "保存")
    @PostMapping("/save")
    @Override
    public Result<AuthorizationInfoVo> save(@RequestBody AuthorizationInfoVo authorizationInfoVo) {
        return ResultEnums.SUCCESS.getResult(this.service.save(authorizationInfoVo));
    }
}