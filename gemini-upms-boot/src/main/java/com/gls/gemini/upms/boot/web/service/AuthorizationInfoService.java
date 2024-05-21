package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.AuthorizationInfoConverter;
import com.gls.gemini.upms.boot.web.entity.AuthorizationInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.AuthorizationInfoMapper;
import com.gls.gemini.upms.sdk.vo.AuthorizationInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 授权信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class AuthorizationInfoService extends BaseServiceImpl<AuthorizationInfoConverter, AuthorizationInfoMapper, AuthorizationInfoVo, AuthorizationInfoEntity> {
    /**
     * 根据token获取授权信息
     *
     * @param token token
     * @return 授权信息
     */
    public List<AuthorizationInfoVo> getByToken(String token) {
        return converter.reverseList(baseMapper.selectList(new QueryWrapper<AuthorizationInfoEntity>()
                .eq(AuthorizationInfoEntity.COL_AUTHORIZATION_CODE_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_ACCESS_TOKEN_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_REFRESH_TOKEN_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_DEVICE_CODE_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_USER_CODE_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_OIDC_ID_TOKEN_VALUE, token)
                .or()
                .eq(AuthorizationInfoEntity.COL_STATE, token)));
    }

    public AuthorizationInfoVo save(AuthorizationInfoVo authorizationInfoVo) {
        AuthorizationInfoEntity entity = baseMapper.selectOne(new QueryWrapper<AuthorizationInfoEntity>()
                .eq(AuthorizationInfoEntity.COL_USER_ID, authorizationInfoVo.getUserId())
                .eq(AuthorizationInfoEntity.COL_CLIENT_ID, authorizationInfoVo.getClientId()));
        if (entity == null) {
            entity = converter.convert(authorizationInfoVo);
        } else {
            entity = converter.convertCopy(authorizationInfoVo, entity);
        }
        this.saveOrUpdate(entity);
        return converter.reverse(entity);

    }
}
