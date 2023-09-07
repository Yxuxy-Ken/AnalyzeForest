-- auto-generated definition
create table devices
(
    ID          int auto_increment
        primary key,
    Device_Name varchar(255) null,
    tree_Id     varchar(255) null,
    entity_id   varchar(255) null,
    DR          int          null
)
    comment '测试表';

