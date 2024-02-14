package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.DemoConverter;
import com.gls.gemini.upms.boot.web.entity.DemoEntity;
import com.gls.gemini.upms.boot.web.mapper.DemoMapper;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import org.springframework.stereotype.Service;

@Service
public class DemoService extends BaseServiceImpl<DemoConverter, DemoMapper, DemoVo, DemoEntity> {


}
