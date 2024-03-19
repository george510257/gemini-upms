package com.gls.gemini.upms.boot.web.converter;

import com.gls.gemini.common.core.base.BaseConverter;
import com.gls.gemini.sdk.core.dto.RoleDto;
import com.gls.gemini.upms.boot.web.entity.RoleInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RoleConverter extends BaseConverter<RoleDto, RoleInfoEntity> {
}
