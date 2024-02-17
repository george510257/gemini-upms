package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.RoleInfoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 角色信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@FeignClient(name = "gemini-upms", contextId = "roleInfo", path = "/roleInfo")
public interface RoleInfoFeign extends BaseFeign<RoleInfoVo> {
}
