package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.UserRoleRelationService;
import com.gls.gemini.upms.sdk.feign.UserRoleRelationFeign;
import com.gls.gemini.upms.sdk.vo.UserRoleRelationVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户角色关系表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/userRoleRelation")
@Tag(name = "userRoleRelation", description = "用户角色关系表")
public class UserRoleRelationController extends BaseController<UserRoleRelationService, UserRoleRelationVo> implements UserRoleRelationFeign {
}