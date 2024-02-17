package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 权限信息表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_permission_info")
public class PermissionInfoEntity extends BaseEntity {

    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_TYPE = "type";
    public static final String COL_URL = "url";
    public static final String COL_METHOD = "method";
    public static final String COL_PID = "pid";
    public static final String COL_LEVEL = "level";
    public static final String COL_SORT = "sort";
    public static final String COL_STATUS = "status";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 权限编码
     */
    private String code;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限描述
     */
    private String description;
    /**
     * 权限类型 1:菜单 2:按钮 3:接口 4:其他
     */
    private Boolean type;
    /**
     * 权限url
     */
    private String url;
    /**
     * 权限请求方式
     */
    private String method;
    /**
     * 父id
     */
    private Long pid;
    /**
     * 层级
     */
    private Boolean level;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态 0:正常 1:禁用
     */
    private Boolean status;
}
