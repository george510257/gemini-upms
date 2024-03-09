package com.gls.gemini.upms.boot.web.converter;

import com.gls.gemini.common.core.base.BaseConverter;
import com.gls.gemini.upms.boot.web.entity.DictInfoEntity;
import com.gls.gemini.upms.sdk.vo.DictInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * 字典信息表 转换器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DictInfoConverter extends BaseConverter<DictInfoVo, DictInfoEntity> {
}
