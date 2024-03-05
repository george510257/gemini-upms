package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.TenantTypeService;
import com.gls.gemini.upms.sdk.feign.TenantTypeFeign;
import com.gls.gemini.upms.sdk.vo.TenantTypeVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 租户类型表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/tenantType")
@Tag(name = "tenantType", description = "租户类型表")
public class TenantTypeController extends BaseController<TenantTypeService, TenantTypeVo> implements TenantTypeFeign {
}