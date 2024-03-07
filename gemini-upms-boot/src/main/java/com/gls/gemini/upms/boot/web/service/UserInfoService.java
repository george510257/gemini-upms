package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.sdk.core.vo.UserVo;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
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
     * 权限信息表 服务
     */
    @Resource
    private PermissionInfoService permissionInfoService;
    /**
     * 组织信息表 服务
     */
    @Resource
    private OrganizationInfoService organizationInfoService;

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    public UserVo loadUserByUsername(String username) {
        QueryWrapper<UserInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(UserInfoEntity.COL_USERNAME, username);
        UserInfoEntity userInfoEntity = this.getOne(queryWrapper);

        if (userInfoEntity == null) {
            return null;
        }

        UserVo userVo = this.converter.reverseUserVo(userInfoEntity);
        userVo.setRoles(this.roleInfoService.listByUserId(userInfoEntity.getId()));
        userVo.setPermissions(this.permissionInfoService.listByUserId(userInfoEntity.getId()));
        userVo.setOrganizations(this.organizationInfoService.listByUserId(userInfoEntity.getId()));
        return userVo;
    }
}
