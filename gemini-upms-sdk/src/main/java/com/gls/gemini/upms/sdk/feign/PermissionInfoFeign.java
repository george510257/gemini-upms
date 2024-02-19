package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.PermissionInfoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 权限信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@FeignClient(name = "gemini-upms", contextId = "permissionInfo", path = "/permissionInfo")
public interface PermissionInfoFeign extends BaseFeign<PermissionInfoVo> {
}
