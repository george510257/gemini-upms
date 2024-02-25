package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.UserOrganizationRelationConverter;
import com.gls.gemini.upms.boot.web.entity.UserOrganizationRelationEntity;
import com.gls.gemini.upms.boot.web.mapper.UserOrganizationRelationMapper;
import com.gls.gemini.upms.sdk.vo.UserOrganizationRelationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户组织关系表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class UserOrganizationRelationService extends BaseServiceImpl<UserOrganizationRelationConverter, UserOrganizationRelationMapper, UserOrganizationRelationVo, UserOrganizationRelationEntity> {
}
