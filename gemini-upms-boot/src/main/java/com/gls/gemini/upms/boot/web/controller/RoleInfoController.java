package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.RoleInfoService;
import com.gls.gemini.upms.sdk.feign.RoleInfoFeign;
import com.gls.gemini.upms.sdk.vo.RoleInfoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/roleInfo")
@Tag(name = "roleInfo", description = "角色信息表")
public class RoleInfoController extends BaseController<RoleInfoService, RoleInfoVo> implements RoleInfoFeign {
}