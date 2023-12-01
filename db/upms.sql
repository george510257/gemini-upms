-- ------------------------
--  用户信息表
-- ------------------------
drop table if exists t_user_info;

create table t_user_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    username         varchar(32)      default ''                                            not null comment '用户名',
    password         varchar(32)      default ''                                            not null comment '密码',
    name             varchar(32)      default ''                                            not null comment '姓名',
    nickname         varchar(32)      default ''                                            not null comment '昵称',
    email            varchar(32)      default ''                                            not null comment '邮箱',
    mobile           varchar(32)      default ''                                            not null comment '手机号',
    avatar           varchar(128)     default ''                                            not null comment '头像',
    status           tinyint unsigned default 0                                             not null comment '状态 0:正常 1:禁用',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_username (username)
) comment '用户信息表';

-- ----------------------------
--  角色信息表
-- ----------------------------
drop table if exists t_role_info;

create table t_role_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(32)      default ''                                            not null comment '角色编码',
    name             varchar(32)      default ''                                            not null comment '角色名称',
    description      varchar(128)     default ''                                            not null comment '角色描述',
    pid              bigint unsigned  default 0                                             not null comment '父id',
    level            tinyint unsigned default 0                                             not null comment '层级',
    sort             int unsigned     default 0                                             not null comment '排序',
    status           tinyint unsigned default 0                                             not null comment '状态 0:正常 1:禁用',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code)
) comment '角色信息表';

-- ----------------------------
--  用户角色关系表
-- ----------------------------
drop table if exists t_user_role_relation;

create table t_user_role_relation
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    user_id          bigint unsigned  default 0                                             not null comment '用户id',
    role_id          bigint unsigned  default 0                                             not null comment '角色id',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_user_id_role_id (user_id, role_id)
) comment '用户角色关系表';

-- ----------------------------
--  权限信息表
-- ----------------------------
drop table if exists t_permission_info;

create table t_permission_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(32)      default ''                                            not null comment '权限编码',
    name             varchar(32)      default ''                                            not null comment '权限名称',
    description      varchar(128)     default ''                                            not null comment '权限描述',
    type             tinyint unsigned default 0                                             not null comment '权限类型 1:菜单 2:按钮 3:接口 4:其他',
    url              varchar(128)     default ''                                            not null comment '权限url',
    method           varchar(32)      default ''                                            not null comment '权限请求方式',
    pid              bigint unsigned  default 0                                             not null comment '父id',
    level            tinyint unsigned default 0                                             not null comment '层级',
    sort             int unsigned     default 0                                             not null comment '排序',
    status           tinyint unsigned default 0                                             not null comment '状态 0:正常 1:禁用',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code)
) comment '权限信息表';

-- ----------------------------
--  角色权限关系表
-- ----------------------------
drop table if exists t_role_permission_relation;

create table t_role_permission_relation
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    role_id          bigint unsigned  default 0                                             not null comment '角色id',
    permission_id    bigint unsigned  default 0                                             not null comment '权限id',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_role_id_permission_id (role_id, permission_id)
) comment '角色权限关系表';
