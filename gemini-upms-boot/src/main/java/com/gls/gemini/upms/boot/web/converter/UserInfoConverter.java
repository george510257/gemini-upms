package com.gls.gemini.upms.boot.web.converter;

import com.gls.gemini.common.core.base.BaseConverter;
import com.gls.gemini.sdk.core.vo.UserVo;
import com.gls.gemini.upms.boot.web.entity.UserInfoEntity;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import org.mapstruct.*;

/**
 * 用户信息表 转换器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserInfoConverter extends BaseConverter<UserInfoVo, UserInfoEntity> {
    /**
     * UserInfoEntity转UserVo
     *
     * @param entity 用户信息
     * @return 用户信息
     */
    @Mappings({
            @Mapping(target = "locale", expression = "java(com.gls.gemini.common.core.util.LocaleUtil.getLocale(entity.getLocale()))"),
            @Mapping(target = "timeZone", expression = "java(com.gls.gemini.common.core.util.TimezoneUtil.getTimezone(entity.getTimeZone()))"),
    })
    UserVo reverseUserVo(UserInfoEntity entity);
}
