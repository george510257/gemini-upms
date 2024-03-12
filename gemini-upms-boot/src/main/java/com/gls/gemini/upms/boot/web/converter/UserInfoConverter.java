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
     * 转换为用户信息表 VO
     *
     * @param entity 用户信息表
     * @return 用户信息表 VO
     */
    UserVo reverseUserVo(UserInfoEntity entity);

    /**
     * 转换为用户信息表
     *
     * @param userVo 用户信息表 VO
     * @return 用户信息表
     */
    UserInfoEntity convertUserVo(UserVo userVo);

    @InheritConfiguration(name = "convertUserVo")
    void convertCopyUserVo(UserVo userVo, @MappingTarget UserInfoEntity userInfoEntity);
}
