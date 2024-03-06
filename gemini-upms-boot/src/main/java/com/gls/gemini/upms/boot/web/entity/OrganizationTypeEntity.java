package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 组织类型表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_organization_type")
public class OrganizationTypeEntity extends BaseEntity {

    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 组织类型编码
     */
    private String code;
    /**
     * 组织类型名称
     */
    private String name;
    /**
     * 组织类型描述
     */
    private String description;
}