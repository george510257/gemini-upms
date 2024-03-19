package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.sdk.core.dto.UserDto;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.UserConverter;
import com.gls.gemini.upms.boot.web.converter.UserInfoConverter;
import com.gls.gemini.upms.boot.web.entity.UserInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.UserInfoMapper;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class UserInfoService extends BaseServiceImpl<UserInfoConverter, UserInfoMapper, UserInfoVo, UserInfoEntity> {
    /**
     * 角色信息表 服务
     */
    @Resource
    private RoleInfoService roleInfoService;
    /**
     * 组织信息表 服务
     */
    @Resource
    private OrganizationInfoService organizationInfoService;
    /**
     * 用户信息转换器
     */
    @Resource
    private UserConverter userConverter;

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    public UserDto loadUserByUsername(String username) {
        UserInfoEntity entity = baseMapper.selectOne(new QueryWrapper<UserInfoEntity>()
                .eq(UserInfoEntity.COL_USERNAME, username));

        if (entity == null) {
            return null;
        }

        UserDto userDto = userConverter.reverse(entity);
        userDto.setRole(roleInfoService.getRoleByUserId(entity.getId()));
        userDto.setOrganization(organizationInfoService.getOrganizationByUserId(entity.getId()));

        userDto.setRoles(roleInfoService.listByUserId(entity.getId()));
        userDto.setOrganizations(organizationInfoService.listByUserId(entity.getId()));
        return userDto;
    }
}
