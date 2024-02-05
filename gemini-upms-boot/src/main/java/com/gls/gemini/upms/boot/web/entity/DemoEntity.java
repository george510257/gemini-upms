package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.util.Date;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("demo")
public class DemoEntity extends BaseEntity {

    public static final String COL_NAME = "name";
    public static final String COL_TITLE = "title";
    public static final String COL_BIRTHDAY = "birthday";

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 标题
     */
    private String title;

    /**
     * 生日
     */
    private Date birthday;
}
