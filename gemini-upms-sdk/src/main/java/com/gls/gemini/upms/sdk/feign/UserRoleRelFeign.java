package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.UserRoleRelVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户角色关系表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "userRoleRel", path = "/userRoleRel")
public interface UserRoleRelFeign extends BaseFeign<UserRoleRelVo> {
}
