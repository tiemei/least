#一个ibatis入门的最简单例子

##1. 首先需要准备数据库
/*

SQLyog 企业版 - MySQL GUI v4.1

主机 - 5.0.7-beta-nt : 数据库 - sample

*********************************************************************

服务器版本 : 5.0.7-beta-nt

create database if not exists `sample`;

USE `sample`;

/*数据表 `t_user` 的表结构*/

drop table if exists `t_user`;

CREATE TABLE `t_user` (

  `id` int(11) NOT NULL auto_increment,

  `name` varchar(50) default NULL,

  `sex` int(11) default NULL,

  PRIMARY KEY  (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*数据表 `t_user` 的数据*/

insert into `t_user` values (1,'tiemei',1),(2,'tiemei',2);

##2. 配置 com.tiemei.demo.ibatis.least.mpas.SqlMapConfig.xml数据库相关配置
##2. 运行com.tiemei.demo.ibatis.least.ExampleMain.java
