package com.gls.gemini.upms.boot.web.converter;

import com.gls.gemini.common.core.base.BaseConverter;
import com.gls.gemini.upms.boot.web.entity.UserOrganizationRelationEntity;
import com.gls.gemini.upms.sdk.vo.UserOrganizationRelationVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * 用户组织关系表 转换器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserOrganizationRelationConverter extends BaseConverter<UserOrganizationRelationVo, UserOrganizationRelationEntity> {
}
