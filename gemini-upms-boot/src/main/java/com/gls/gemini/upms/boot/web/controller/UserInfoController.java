package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.common.core.enums.ResultEnums;
import com.gls.gemini.sdk.core.vo.UserVo;
import com.gls.gemini.upms.boot.web.service.UserInfoService;
import com.gls.gemini.upms.sdk.feign.UserInfoFeign;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/userInfo")
@Tag(name = "userInfo", description = "用户信息表")
public class UserInfoController extends BaseController<UserInfoService, UserInfoVo> implements UserInfoFeign {
    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @Override
    @Operation(summary = "根据用户名获取用户信息", description = "根据用户名获取用户信息")
    @Parameter(name = "username", description = "用户名")
    public Result<UserVo> loadUserByUsername(String username) {
        return ResultEnums.SUCCESS.getResult(service.loadUserByUsername(username));
    }
}