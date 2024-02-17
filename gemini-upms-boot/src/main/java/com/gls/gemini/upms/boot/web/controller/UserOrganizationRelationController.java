package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.UserOrganizationRelationService;
import com.gls.gemini.upms.sdk.vo.UserOrganizationRelationVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户组织关系表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Slf4j
@RestController
@RequestMapping("/userOrganizationRelation")
@Tag(name = "userOrganizationRelation", description = "用户组织关系表")
public class UserOrganizationRelationController extends BaseController<UserOrganizationRelationService, UserOrganizationRelationVo> {
}