package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.RolePermissionRelService;
import com.gls.gemini.upms.sdk.feign.RolePermissionRelFeign;
import com.gls.gemini.upms.sdk.vo.RolePermissionRelVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色权限关系表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/rolePermissionRel")
@Tag(name = "rolePermissionRel", description = "角色权限关系表")
public class RolePermissionRelController extends BaseController<RolePermissionRelService, RolePermissionRelVo> implements RolePermissionRelFeign {
}