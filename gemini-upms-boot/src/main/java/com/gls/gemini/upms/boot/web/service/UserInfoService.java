package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.sdk.core.vo.UserVo;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.UserInfoConverter;
import com.gls.gemini.upms.boot.web.entity.UserInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.UserInfoMapper;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * 用户信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class UserInfoService extends BaseServiceImpl<UserInfoConverter, UserInfoMapper, UserInfoVo, UserInfoEntity> implements UserDetailsService {
    public UserVo loadUserByUsername(String username) {
        UserInfoEntity entity = this.getOne(new QueryWrapper<UserInfoEntity>().eq(UserInfoEntity.COL_USERNAME, username));
        UserVo userVo = this.converter.toUserVo(entity);
        log.info("userVo: {}", userVo);
        return userVo;
    }
}
