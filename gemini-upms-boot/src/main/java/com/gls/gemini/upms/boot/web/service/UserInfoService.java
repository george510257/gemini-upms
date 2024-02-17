package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.UserInfoConverter;
import com.gls.gemini.upms.boot.web.entity.UserInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.UserInfoMapper;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Slf4j
@Service
public class UserInfoService extends BaseServiceImpl<UserInfoConverter, UserInfoMapper, UserInfoVo, UserInfoEntity> {
}
