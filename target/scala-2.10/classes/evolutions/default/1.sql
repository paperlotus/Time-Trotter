# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table apply_leave (
  id                        bigint auto_increment not null,
  start_date                datetime,
  no_of_days                varchar(255),
  type_of_leave             varchar(14),
  remarks                   varchar(255),
  status                    varchar(9),
  user_id                   bigint,
  pending_with_id           bigint,
  level                     integer,
  process_instance_id       varchar(255),
  leave_guid                varchar(255),
  constraint ck_apply_leave_type_of_leave check (type_of_leave in ('All','AnnualLeave','SickLeave','MaternityLeave')),
  constraint ck_apply_leave_status check (status in ('Submitted','Rejected','Approved','Withdrawn')),
  constraint pk_apply_leave primary key (id))
;

create table client (
  id                        bigint auto_increment not null,
  client_name               varchar(255),
  phone_no                  varchar(255),
  email                     varchar(255),
  fax                       integer,
  address                   varchar(255),
  street                    varchar(255),
  city                      varchar(255),
  country                   varchar(255),
  pin                       varchar(255),
  contact_name              varchar(255),
  contact_phone             varchar(255),
  contact_email             varchar(255),
  company_id                bigint,
  constraint pk_client primary key (id))
;

create table company (
  id                        bigint auto_increment not null,
  company_name              varchar(255),
  company_code              varchar(255),
  company_email             varchar(255),
  company_phone             varchar(255),
  address                   varchar(255),
  company_status            varchar(15),
  constraint ck_company_company_status check (company_status in ('PendingApproval','Approved','Disapproved')),
  constraint pk_company primary key (id))
;

create table delegate (
  id                        bigint auto_increment not null,
  from_date                 datetime,
  to_date                   datetime,
  delegator_id              bigint,
  delegated_to_id           bigint,
  constraint pk_delegate primary key (id))
;

create table feedback (
  id                        bigint auto_increment not null,
  feedback_date             datetime,
  feedback                  longtext,
  rating                    integer,
  user_id                   bigint,
  manager_id                bigint,
  constraint ck_feedback_rating check (rating in (0,1,2,3,4)),
  constraint pk_feedback primary key (id))
;

create table mail_setting (
  id                        bigint auto_increment not null,
  host_name                 varchar(255),
  port_number               varchar(255),
  ssl_port                  tinyint(1) default 0,
  tls_port                  tinyint(1) default 0,
  user_name                 varchar(255),
  password                  varchar(255),
  company_object_id         bigint,
  last_update               datetime not null,
  constraint pk_mail_setting primary key (id))
;

create table notification (
  id                        bigint auto_increment not null,
  setting_as_json           varchar(255),
  company_id                bigint,
  constraint pk_notification primary key (id))
;

create table project (
  id                        bigint auto_increment not null,
  client_name_id            bigint,
  project_name              varchar(255),
  project_code              varchar(255),
  project_description       varchar(255),
  start_date                datetime,
  end_date                  datetime,
  budget                    double,
  currency                  varchar(6),
  efforts                   integer,
  project_manager_id        bigint,
  company_obj_id            bigint,
  constraint ck_project_currency check (currency in ('INR','Euro','Pound','Dollar')),
  constraint pk_project primary key (id))
;

create table role_level (
  id                        bigint auto_increment not null,
  role_x_id                 bigint,
  role_level                integer,
  role_name                 varchar(255),
  reporting_to              varchar(255),
  final_approval            varchar(255),
  permissions               varchar(700),
  last_update               datetime not null,
  constraint ck_role_level_role_level check (role_level in (0,1,2,3,4,5,6,7,8,9)),
  constraint pk_role_level primary key (id))
;

create table role_x (
  id                        bigint auto_increment not null,
  company_id                bigint,
  constraint pk_role_x primary key (id))
;

create table task (
  id                        bigint auto_increment not null,
  task_name                 varchar(255),
  task_code                 varchar(255),
  start_date                datetime,
  end_date                  datetime,
  effort                    integer,
  is_billable               varchar(3),
  constraint ck_task_is_billable check (is_billable in ('Yes','No')),
  constraint pk_task primary key (id))
;

create table timesheet (
  id                        bigint auto_increment not null,
  user_id                   bigint,
  status                    integer,
  week_of_year              integer,
  year                      integer,
  timesheet_with_id         bigint,
  level                     integer,
  process_instance_id       varchar(255),
  tid                       varchar(255),
  constraint ck_timesheet_status check (status in (0,1,2,3)),
  constraint pk_timesheet primary key (id))
;

create table timesheet_row (
  id                        bigint auto_increment not null,
  timesheet_id              bigint,
  project_code              varchar(255),
  task_code                 varchar(255),
  total_hrs                 integer,
  sun                       integer,
  mon                       integer,
  tue                       integer,
  wed                       integer,
  thu                       integer,
  fri                       integer,
  sat                       integer,
  over_time                 tinyint(1) default 0,
  constraint pk_timesheet_row primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  salutation                varchar(4),
  employee_id               varchar(255),
  first_name                varchar(255),
  middle_name               varchar(255),
  last_name                 varchar(255),
  email                     varchar(255),
  gender                    varchar(6),
  status                    varchar(8),
  hire_date                 datetime,
  annual_income             double,
  hourlyrate                double,
  companyobject_id          bigint,
  designation               varchar(255),
  role_id                   bigint,
  manager_id                bigint,
  release_date              datetime,
  hrmanager_id              bigint,
  permissions               varchar(700),
  temp_password             integer,
  password                  varchar(255),
  reset_flag                tinyint(1) default 0,
  failed_login_attempt      integer,
  create_date               datetime,
  modified_date             datetime,
  password_reset            tinyint(1) default 0,
  user_status               varchar(15),
  process_instance_id       varchar(255),
  last_update               datetime not null,
  constraint ck_user_salutation check (salutation in ('Mr','Miss','Mrs')),
  constraint ck_user_gender check (gender in ('Male','Female')),
  constraint ck_user_status check (status in ('OnRolls','OffRolls')),
  constraint ck_user_user_status check (user_status in ('PendingApproval','Approved','Disapproved')),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;


create table project_user (
  project_id                     bigint not null,
  user_id                        bigint not null,
  constraint pk_project_user primary key (project_id, user_id))
;

create table project_task (
  project_id                     bigint not null,
  task_id                        bigint not null,
  constraint pk_project_task primary key (project_id, task_id))
;

create table task_project (
  task_id                        bigint not null,
  project_id                     bigint not null,
  constraint pk_task_project primary key (task_id, project_id))
;

create table user_project (
  user_id                        bigint not null,
  project_id                     bigint not null,
  constraint pk_user_project primary key (user_id, project_id))
;
alter table apply_leave add constraint fk_apply_leave_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_apply_leave_user_1 on apply_leave (user_id);
alter table apply_leave add constraint fk_apply_leave_pendingWith_2 foreign key (pending_with_id) references user (id) on delete restrict on update restrict;
create index ix_apply_leave_pendingWith_2 on apply_leave (pending_with_id);
alter table client add constraint fk_client_company_3 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_client_company_3 on client (company_id);
alter table delegate add constraint fk_delegate_delegator_4 foreign key (delegator_id) references user (id) on delete restrict on update restrict;
create index ix_delegate_delegator_4 on delegate (delegator_id);
alter table delegate add constraint fk_delegate_delegatedTo_5 foreign key (delegated_to_id) references user (id) on delete restrict on update restrict;
create index ix_delegate_delegatedTo_5 on delegate (delegated_to_id);
alter table feedback add constraint fk_feedback_user_6 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_feedback_user_6 on feedback (user_id);
alter table feedback add constraint fk_feedback_manager_7 foreign key (manager_id) references user (id) on delete restrict on update restrict;
create index ix_feedback_manager_7 on feedback (manager_id);
alter table mail_setting add constraint fk_mail_setting_companyObject_8 foreign key (company_object_id) references company (id) on delete restrict on update restrict;
create index ix_mail_setting_companyObject_8 on mail_setting (company_object_id);
alter table notification add constraint fk_notification_company_9 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_notification_company_9 on notification (company_id);
alter table project add constraint fk_project_clientName_10 foreign key (client_name_id) references client (id) on delete restrict on update restrict;
create index ix_project_clientName_10 on project (client_name_id);
alter table project add constraint fk_project_projectManager_11 foreign key (project_manager_id) references user (id) on delete restrict on update restrict;
create index ix_project_projectManager_11 on project (project_manager_id);
alter table project add constraint fk_project_companyObj_12 foreign key (company_obj_id) references company (id) on delete restrict on update restrict;
create index ix_project_companyObj_12 on project (company_obj_id);
alter table role_level add constraint fk_role_level_roleX_13 foreign key (role_x_id) references role_x (id) on delete restrict on update restrict;
create index ix_role_level_roleX_13 on role_level (role_x_id);
alter table role_x add constraint fk_role_x_company_14 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_role_x_company_14 on role_x (company_id);
alter table timesheet add constraint fk_timesheet_user_15 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_timesheet_user_15 on timesheet (user_id);
alter table timesheet add constraint fk_timesheet_timesheetWith_16 foreign key (timesheet_with_id) references user (id) on delete restrict on update restrict;
create index ix_timesheet_timesheetWith_16 on timesheet (timesheet_with_id);
alter table timesheet_row add constraint fk_timesheet_row_timesheet_17 foreign key (timesheet_id) references timesheet (id) on delete restrict on update restrict;
create index ix_timesheet_row_timesheet_17 on timesheet_row (timesheet_id);
alter table user add constraint fk_user_companyobject_18 foreign key (companyobject_id) references company (id) on delete restrict on update restrict;
create index ix_user_companyobject_18 on user (companyobject_id);
alter table user add constraint fk_user_role_19 foreign key (role_id) references role_level (id) on delete restrict on update restrict;
create index ix_user_role_19 on user (role_id);
alter table user add constraint fk_user_manager_20 foreign key (manager_id) references user (id) on delete restrict on update restrict;
create index ix_user_manager_20 on user (manager_id);
alter table user add constraint fk_user_hrmanager_21 foreign key (hrmanager_id) references user (id) on delete restrict on update restrict;
create index ix_user_hrmanager_21 on user (hrmanager_id);



alter table project_user add constraint fk_project_user_project_01 foreign key (project_id) references project (id) on delete restrict on update restrict;

alter table project_user add constraint fk_project_user_user_02 foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table project_task add constraint fk_project_task_project_01 foreign key (project_id) references project (id) on delete restrict on update restrict;

alter table project_task add constraint fk_project_task_task_02 foreign key (task_id) references task (id) on delete restrict on update restrict;

alter table task_project add constraint fk_task_project_task_01 foreign key (task_id) references task (id) on delete restrict on update restrict;

alter table task_project add constraint fk_task_project_project_02 foreign key (project_id) references project (id) on delete restrict on update restrict;

alter table user_project add constraint fk_user_project_user_01 foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table user_project add constraint fk_user_project_project_02 foreign key (project_id) references project (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table apply_leave;

drop table client;

drop table company;

drop table delegate;

drop table feedback;

drop table mail_setting;

drop table notification;

drop table project;

drop table project_user;

drop table project_task;

drop table role_level;

drop table role_x;

drop table task;

drop table task_project;

drop table timesheet;

drop table timesheet_row;

drop table user;

drop table user_project;

SET FOREIGN_KEY_CHECKS=1;

