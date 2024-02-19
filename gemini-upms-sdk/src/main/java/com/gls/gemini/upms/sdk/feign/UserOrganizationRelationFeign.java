package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.UserOrganizationRelationVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户组织关系表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@FeignClient(name = "gemini-upms", contextId = "userOrganizationRelation", path = "/userOrganizationRelation")
public interface UserOrganizationRelationFeign extends BaseFeign<UserOrganizationRelationVo> {
}
