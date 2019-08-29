create table WIZARD_OWN_DOCUMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SERIAL varchar(255),
    NUMBER_ varchar(255),
    OWN_ID varchar(36),
    --
    primary key (ID)
);