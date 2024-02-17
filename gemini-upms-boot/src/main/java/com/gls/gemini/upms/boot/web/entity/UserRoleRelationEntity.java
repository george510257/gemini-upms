package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 用户角色关系表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_user_role_relation")
public class UserRoleRelationEntity extends BaseEntity {

    public static final String COL_USER_ID = "user_id";
    public static final String COL_ROLE_ID = "role_id";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 角色id
     */
    private Long roleId;
}
