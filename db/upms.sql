-- ----------------------------
--  数据库初始化脚本
-- ----------------------------
-- 1. 创建数据库
drop database if exists gemini_upms;

create database gemini_upms default character set utf8mb4 collate utf8mb4_general_ci;

use gemini_upms;

set names utf8mb4;

-- 2. 创建表
-- ----------------------------
--  字典信息表
-- ----------------------------
drop table if exists t_dict_info;

create table t_dict_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(100)     default ''                                            not null comment '字典编码',
    name             varchar(100)     default ''                                            not null comment '字典名称',
    description      varchar(1000)    default ''                                            not null comment '字典描述',
    type_id          bigint unsigned  default 0                                             not null comment '字典类型id 0:公共字典类型',
    parent_id        bigint unsigned  default 0                                             not null comment '父字典id 0:无父字典',
    sort             int unsigned     default 0                                             not null comment '排序',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code),
    unique key uk_name (name)
) engine = InnoDB
  default charset = utf8mb4 comment '字典信息表';

-- ----------------------------
--  初始化字典信息
-- ----------------------------
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 'org_type', '组织类型', '组织类型', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (11, 'org_company', '公司', '公司', 0, 1, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 'role_type', '角色类型', '角色类型', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (3, 'permission_type', '权限类型', '权限类型', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (4, 'user_status', '用户状态', '用户状态', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (5, 'user_type', '用户类型', '用户类型', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_dict_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (6, 'tenant_type', '租户类型', '租户类型', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');


-- ----------------------------
--  客户端信息表
-- ----------------------------
drop table if exists t_client_info;

create table t_client_info
(
    id                            bigint unsigned auto_increment                                         not null comment '主键id',
    client_id                     varchar(100)     default ''                                            not null comment '客户端id',
    client_id_issued_at           timestamp        default current_timestamp                             not null comment '客户端id发放时间',
    client_secret                 varchar(200)     default ''                                            not null comment '客户端密钥',
    client_secret_expires_at      timestamp        default '2038-01-19 03:14:07'                         not null comment '客户端密钥过期时间',
    client_name                   varchar(200)     default ''                                            not null comment '客户端名称',
    client_authentication_methods varchar(1000)    default ''                                            not null comment '客户端认证方式',
    authorized_grant_types        varchar(1000)    default ''                                            not null comment '授权类型',
    redirect_uris                 varchar(1000)    default ''                                            not null comment '重定向地址',
    post_logout_redirect_uris     varchar(1000)    default ''                                            not null comment '登出重定向地址',
    scopes                        varchar(1000)    default ''                                            not null comment '作用域',
    client_settings               varchar(2000)    default ''                                            not null comment '客户端设置',
    token_settings                varchar(2000)    default ''                                            not null comment 'token设置',
    additional_information        varchar(2000)    default ''                                            not null comment '附加信息',
    tenant_id                     bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version                       int unsigned     default 0                                             not null comment '版本号',
    deleted                       tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id                bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name              varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time                   timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id                bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name              varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time                   timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_client_id (client_id),
    unique key uk_client_name (client_name)
) engine = InnoDB
  default charset = utf8mb4 comment '客户端信息表';

-- ----------------------------
--  初始化客户端信息
-- ----------------------------
insert into t_client_info (id, client_id, client_id_issued_at, client_secret, client_secret_expires_at, client_name,
                           client_authentication_methods, authorized_grant_types, redirect_uris,
                           post_logout_redirect_uris, scopes, client_settings, token_settings, additional_information,
                           tenant_id, version, deleted, create_user_id, create_user_name, create_time, update_user_id,
                           update_user_name, update_time)
values (1, 'messaging-client', '2021-01-01 00:00:00', '{noop}secret', '2038-01-19 03:14:07', 'messaging-client',
        'client_secret_basic',
        'refresh_token,client_credentials,authorization_code',
        'http://127.0.0.1:8080/login/oauth2/code/messaging-client-oidc,https://www.baidu.com',
        'http://localhost:8080/logout', 'message:read,openid,profile,message:write',
        '{"settings.client.require-proof-key":false,"settings.client.require-authorization-consent":true}',
        '{"settings.token.reuse-refresh-tokens":true,"settings.token.id-token-signature-algorithm":"RS256","settings.token.access-token-time-to-live":"PT5M","settings.token.access-token-format":{"value":"self-contained"},"settings.token.refresh-token-time-to-live":"PT1H","settings.token.authorization-code-time-to-live":"PT5M","settings.token.device-code-time-to-live":"PT5M"}',
        '', 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_client_info (id, client_id, client_id_issued_at, client_secret, client_secret_expires_at, client_name,
                           client_authentication_methods, authorized_grant_types, redirect_uris,
                           post_logout_redirect_uris, scopes, client_settings, token_settings, additional_information,
                           tenant_id, version, deleted, create_user_id, create_user_name, create_time, update_user_id,
                           update_user_name, update_time)
values (2, 'device-client', '2021-01-01 00:00:00', '{noop}secret', '2038-01-19 03:14:07', 'device-client',
        'none',
        'refresh_token,urn:ietf:params:oauth:grant-type:device_code',
        '', '', 'message:read,message:write',
        '{"settings.client.require-proof-key":false,"settings.client.require-authorization-consent":false}',
        '{"settings.token.reuse-refresh-tokens":true,"settings.token.id-token-signature-algorithm":"RS256","settings.token.access-token-time-to-live":"PT5M","settings.token.access-token-format":{"value":"self-contained"},"settings.token.refresh-token-time-to-live":"PT1H","settings.token.authorization-code-time-to-live":"PT5M","settings.token.device-code-time-to-live":"PT5M"}',
        '', 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');

-- ----------------------------
--  授权信息表
-- ----------------------------
drop table if exists t_authorization_info;

create table t_authorization_info
(
    id                            bigint unsigned auto_increment                                         not null comment '主键id',
    client_id                     bigint unsigned  default 0                                             not null comment '客户端id',
    user_id                       bigint unsigned  default 0                                             not null comment '用户id',
    authorization_grant_type      varchar(100)     default ''                                            not null comment '授权',
    authorized_scopes             varchar(1000)    default ''                                            not null comment '授权作用域',
    attributes                    text                                                                   not null comment '属性',
    state                         varchar(500)     default ''                                            not null comment '状态',
    authorization_code_value      text                                                                   not null comment '授权码值',
    authorization_code_issued_at  timestamp        default current_timestamp                             not null comment '授权码发放时间',
    authorization_code_expires_at timestamp        default '2038-01-19 03:14:07'                         not null comment '授权码过期时间',
    authorization_code_metadata   text                                                                   not null comment '授权码元数据',
    access_token_value            text                                                                   not null comment '访问token值',
    access_token_issued_at        timestamp        default current_timestamp                             not null comment '访问token发放时间',
    access_token_expires_at       timestamp        default '2038-01-19 03:14:07'                         not null comment '访问token过期时间',
    access_token_metadata         text                                                                   not null comment '访问token元数据',
    access_token_type             varchar(100)     default ''                                            not null comment '访问token类型',
    access_token_scopes           varchar(1000)    default ''                                            not null comment '访问token作用域',
    refresh_token_value           text                                                                   not null comment '刷新token值',
    refresh_token_issued_at       timestamp        default current_timestamp                             not null comment '刷新token发放时间',
    refresh_token_expires_at      timestamp        default '2038-01-19 03:14:07'                         not null comment '刷新token过期时间',
    refresh_token_metadata        text                                                                   not null comment '刷新token元数据',
    oidc_id_token_value           text                                                                   not null comment 'oidc id token值',
    oidc_id_token_issued_at       timestamp        default current_timestamp                             not null comment 'oidc id token发放时间',
    oidc_id_token_expires_at      timestamp        default '2038-01-19 03:14:07'                         not null comment 'oidc id token过期时间',
    oidc_id_token_metadata        text                                                                   not null comment 'oidc id token元数据',
    user_code_value               text                                                                   not null comment '用户code值',
    user_code_issued_at           timestamp        default current_timestamp                             not null comment '用户code发放时间',
    user_code_expires_at          timestamp        default '2038-01-19 03:14:07'                         not null comment '用户code过期时间',
    user_code_metadata            text                                                                   not null comment '用户code元数据',
    device_code_value             text                                                                   not null comment '设备code值',
    device_code_issued_at         timestamp        default current_timestamp                             not null comment '设备code发放时间',
    device_code_expires_at        timestamp        default '2038-01-19 03:14:07'                         not null comment '设备code过期时间',
    device_code_metadata          text                                                                   not null comment '设备code元数据',
    tenant_id                     bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version                       int unsigned     default 0                                             not null comment '版本号',
    deleted                       tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id                bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name              varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time                   timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id                bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name              varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time                   timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_client_id_user_id (client_id, user_id)
) engine = InnoDB
  default charset = utf8mb4 comment '授权信息表';

-- ----------------------------
--  授权同意信息表
-- ----------------------------
drop table if exists t_authorization_consent_info;

create table t_authorization_consent_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    client_id        bigint unsigned  default 0                                             not null comment '客户端id',
    user_id          bigint unsigned  default 0                                             not null comment '用户id',
    authorities      varchar(1000)    default ''                                            not null comment '权限',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_client_id_user_id (client_id, user_id)
) engine = InnoDB
  default charset = utf8mb4 comment '授权同意信息表';

-- ----------------------------
--  用户信息表
-- ----------------------------
drop table if exists t_user_info;

create table t_user_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    username         varchar(100)     default ''                                            not null comment '用户名',
    password         varchar(100)     default ''                                            not null comment '密码',
    mobile           varchar(20)      default ''                                            not null comment '手机号',
    email            varchar(100)     default ''                                            not null comment '邮箱',
    real_name        varchar(100)     default ''                                            not null comment '真实姓名',
    nick_name        varchar(100)     default ''                                            not null comment '昵称',
    avatar           varchar(100)     default ''                                            not null comment '头像',
    language         varchar(20)      default ''                                            not null comment '语言',
    locale           varchar(20)      default ''                                            not null comment '区域',
    time_zone        varchar(20)      default ''                                            not null comment '时区',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_username (username),
    unique key uk_mobile (mobile),
    unique key uk_email (email)
) engine = InnoDB
  default charset = utf8mb4 comment '用户信息表';

-- ----------------------------
--  初始化用户信息
-- ----------------------------
insert into t_user_info (id, username, password, mobile, email, real_name, nick_name, avatar, language, locale,
                         time_zone,
                         tenant_id, version, deleted, create_user_id, create_user_name, create_time, update_user_id,
                         update_user_name, update_time)
values (1, 'admin', '{noop}admin', '13800000000', 'admin@gls.com', '管理员', 'admin', '', 'zh_CN', 'zh_CN',
        'Asia/Shanghai',
        0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');

-- ----------------------------
--  角色信息表
-- ----------------------------
drop table if exists t_role_info;

create table t_role_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(100)     default ''                                            not null comment '角色编码',
    name             varchar(100)     default ''                                            not null comment '角色名称',
    description      varchar(1000)    default ''                                            not null comment '角色描述',
    type_id          bigint unsigned  default 0                                             not null comment '角色类型id 0:公共角色类型',
    parent_id        bigint unsigned  default 0                                             not null comment '父角色id 0:无父角色',
    sort             int unsigned     default 0                                             not null comment '排序',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code),
    unique key uk_name (name)
) engine = InnoDB
  default charset = utf8mb4 comment '角色信息表';

-- ----------------------------
--  初始化角色信息
-- ----------------------------
insert into t_role_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 'admin', '管理员', '管理员', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_role_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                         create_user_id,
                         create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 'user', '用户', '用户', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');

-- ----------------------------
--  权限信息表
-- ----------------------------
drop table if exists t_permission_info;

create table t_permission_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(100)     default ''                                            not null comment '权限编码',
    name             varchar(100)     default ''                                            not null comment '权限名称',
    description      varchar(1000)    default ''                                            not null comment '权限描述',
    type_id          bigint unsigned  default 0                                             not null comment '权限类型id 0:公共权限类型',
    parent_id        bigint unsigned  default 0                                             not null comment '父权限id 0:无父权限',
    sort             int unsigned     default 0                                             not null comment '排序',
    command          varchar(1000)    default ''                                            not null comment '命令',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code),
    unique key uk_name (name)
) engine = InnoDB
  default charset = utf8mb4 comment '权限信息表';

-- ----------------------------
--  初始化权限信息
-- ----------------------------
insert into t_permission_info (id, code, name, description, type_id, parent_id, sort, command, tenant_id, version,
                               deleted,
                               create_user_id, create_user_name, create_time, update_user_id, update_user_name,
                               update_time)
values (1, 'message:read', '消息读取', '消息读取', 0, 0, 0, 'message:read', 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00',
        0, 'admin', '2021-01-01 00:00:00');
insert into t_permission_info (id, code, name, description, type_id, parent_id, sort, command, tenant_id, version,
                               deleted,
                               create_user_id, create_user_name, create_time, update_user_id, update_user_name,
                               update_time)
values (2, 'message:write', '消息写入', '消息写入', 0, 0, 0, 'message:write', 0, 0, 0, 0, 'admin',
        '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');

-- ----------------------------
--  组织信息表
-- ----------------------------
drop table if exists t_organization_info;

create table t_organization_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(100)     default ''                                            not null comment '组织编码',
    name             varchar(100)     default ''                                            not null comment '组织名称',
    description      varchar(1000)    default ''                                            not null comment '组织描述',
    type_id          bigint unsigned  default 0                                             not null comment '组织类型id 0:公共组织类型',
    parent_id        bigint unsigned  default 0                                             not null comment '父组织id 0:无父组织',
    sort             int unsigned     default 0                                             not null comment '排序',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code),
    unique key uk_name (name)
) engine = InnoDB
  default charset = utf8mb4 comment '组织信息表';

-- ----------------------------
--  初始化组织信息
-- ----------------------------
insert into t_organization_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                                 create_user_id,
                                 create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 'root', '根组织', '根组织', 0, 0, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_organization_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                                 create_user_id,
                                 create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 'sub', '子组织', '子组织', 0, 1, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');
insert into t_organization_info (id, code, name, description, type_id, parent_id, sort, tenant_id, version, deleted,
                                 create_user_id,
                                 create_user_name, create_time, update_user_id, update_user_name, update_time)
values (3, 'sub1', '子组织1', '子组织1', 0, 2, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');

-- ----------------------------
--  租户信息表
-- ----------------------------
drop table if exists t_tenant_info;

create table t_tenant_info
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    code             varchar(100)     default ''                                            not null comment '租户编码',
    name             varchar(100)     default ''                                            not null comment '租户名称',
    description      varchar(1000)    default ''                                            not null comment '租户描述',
    type_id          bigint unsigned  default 0                                             not null comment '租户类型id 0:公共租户类型',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_code (code),
    unique key uk_name (name)
) engine = InnoDB
  default charset = utf8mb4 comment '租户信息表';

-- ----------------------------
--  初始化租户信息
-- ----------------------------
insert into t_tenant_info (id, code, name, description, type_id, tenant_id, version, deleted, create_user_id,
                           create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 'root', '根租户', '根租户', 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin',
        '2021-01-01 00:00:00');

-- ----------------------------
--  用户角色关系表
-- ----------------------------
drop table if exists t_user_role_rel;

create table t_user_role_rel
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    user_id          bigint unsigned  default 0                                             not null comment '用户id',
    role_id          bigint unsigned  default 0                                             not null comment '角色id',
    default_flag     tinyint unsigned default 0                                             not null comment '是否默认 0:否 1:是',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_user_id_role_id (user_id, role_id)
) engine = InnoDB
  default charset = utf8mb4 comment '用户角色关系表';

-- ----------------------------
--  初始化用户角色关系
-- ----------------------------
insert into t_user_role_rel (id, user_id, role_id, default_flag, tenant_id, version, deleted, create_user_id,
                             create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 1, 1, 1, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_user_role_rel (id, user_id, role_id, default_flag, tenant_id, version, deleted, create_user_id,
                             create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 1, 2, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');

-- ----------------------------
--  角色权限关系表
-- ----------------------------
drop table if exists t_role_permission_rel;

create table t_role_permission_rel
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    role_id          bigint unsigned  default 0                                             not null comment '角色id',
    permission_id    bigint unsigned  default 0                                             not null comment '权限id',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_role_id_permission_id (role_id, permission_id)
) engine = InnoDB
  default charset = utf8mb4 comment '角色权限关系表';

-- ----------------------------
--  初始化角色权限关系
-- ----------------------------
insert into t_role_permission_rel (id, role_id, permission_id, tenant_id, version, deleted, create_user_id,
                                   create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 1, 1, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_role_permission_rel (id, role_id, permission_id, tenant_id, version, deleted, create_user_id,
                                   create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 1, 2, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_role_permission_rel (id, role_id, permission_id, tenant_id, version, deleted, create_user_id,
                                   create_user_name, create_time, update_user_id, update_user_name, update_time)
values (3, 2, 1, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_role_permission_rel (id, role_id, permission_id, tenant_id, version, deleted, create_user_id,
                                   create_user_name, create_time, update_user_id, update_user_name, update_time)
values (4, 2, 2, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');

-- ----------------------------
--  用户组织关系表
-- ----------------------------
drop table if exists t_user_organization_rel;

create table t_user_organization_rel
(
    id               bigint unsigned auto_increment                                         not null comment '主键id',
    user_id          bigint unsigned  default 0                                             not null comment '用户id',
    organization_id  bigint unsigned  default 0                                             not null comment '组织id',
    default_flag     tinyint unsigned default 0                                             not null comment '是否默认 0:否 1:是',
    tenant_id        bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version          int unsigned     default 0                                             not null comment '版本号',
    deleted          tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id   bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time      timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id   bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time      timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id),
    unique key uk_user_id_organization_id (user_id, organization_id)
) engine = InnoDB
  default charset = utf8mb4 comment '用户组织关系表';

-- ----------------------------
--  初始化用户组织关系
-- ----------------------------
insert into t_user_organization_rel (id, user_id, organization_id, default_flag, tenant_id, version, deleted,
                                     create_user_id,
                                     create_user_name, create_time, update_user_id, update_user_name, update_time)
values (1, 1, 1, 1, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_user_organization_rel (id, user_id, organization_id, default_flag, tenant_id, version, deleted,
                                     create_user_id,
                                     create_user_name, create_time, update_user_id, update_user_name, update_time)
values (2, 1, 2, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');
insert into t_user_organization_rel (id, user_id, organization_id, default_flag, tenant_id, version, deleted,
                                     create_user_id,
                                     create_user_name, create_time, update_user_id, update_user_name, update_time)
values (3, 1, 3, 0, 0, 0, 0, 0, 'admin', '2021-01-01 00:00:00', 0, 'admin', '2021-01-01 00:00:00');