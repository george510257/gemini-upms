package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.RolePermissionRelVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 角色权限关系表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "rolePermissionRel", path = "/rolePermissionRel")
public interface RolePermissionRelFeign extends BaseFeign<RolePermissionRelVo> {
}
