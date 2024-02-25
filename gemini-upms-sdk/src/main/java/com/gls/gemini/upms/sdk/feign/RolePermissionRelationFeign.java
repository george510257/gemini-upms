package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.RolePermissionRelationVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 角色权限关系表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "rolePermissionRelation", path = "/rolePermissionRelation")
public interface RolePermissionRelationFeign extends BaseFeign<RolePermissionRelationVo> {
}
