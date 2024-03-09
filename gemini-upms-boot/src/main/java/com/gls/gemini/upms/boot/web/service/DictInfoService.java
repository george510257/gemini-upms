package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.DictInfoConverter;
import com.gls.gemini.upms.boot.web.entity.DictInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.DictInfoMapper;
import com.gls.gemini.upms.sdk.vo.DictInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 字典信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class DictInfoService extends BaseServiceImpl<DictInfoConverter, DictInfoMapper, DictInfoVo, DictInfoEntity> {
}
