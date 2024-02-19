package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.OrganizationInfoService;
import com.gls.gemini.upms.sdk.vo.OrganizationInfoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组织信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Slf4j
@RestController
@RequestMapping("/organizationInfo")
@Tag(name = "organizationInfo", description = "组织信息表")
public class OrganizationInfoController extends BaseController<OrganizationInfoService, OrganizationInfoVo> {
}