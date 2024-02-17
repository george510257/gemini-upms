package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.UserRoleRelationVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户角色关系表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@FeignClient(name = "gemini-upms", contextId = "userRoleRelation", path = "/userRoleRelation")
public interface UserRoleRelationFeign extends BaseFeign<UserRoleRelationVo> {
}
