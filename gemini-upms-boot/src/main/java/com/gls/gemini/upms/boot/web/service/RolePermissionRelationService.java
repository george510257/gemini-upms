package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.RolePermissionRelationConverter;
import com.gls.gemini.upms.boot.web.entity.RolePermissionRelationEntity;
import com.gls.gemini.upms.boot.web.mapper.RolePermissionRelationMapper;
import com.gls.gemini.upms.sdk.vo.RolePermissionRelationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 角色权限关系表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Slf4j
@Service
public class RolePermissionRelationService extends BaseServiceImpl<RolePermissionRelationConverter, RolePermissionRelationMapper, RolePermissionRelationVo, RolePermissionRelationEntity> {
}
