#һ��ibatis���ŵ��������

##1. ������Ҫ׼�����ݿ�
/*

SQLyog ��ҵ�� - MySQL GUI v4.1

���� - 5.0.7-beta-nt : ���ݿ� - sample

*********************************************************************

�������汾 : 5.0.7-beta-nt

create database if not exists `sample`;

USE `sample`;

/*���ݱ� `t_user` �ı�ṹ*/

drop table if exists `t_user`;

CREATE TABLE `t_user` (

  `id` int(11) NOT NULL auto_increment,

  `name` varchar(50) default NULL,

  `sex` int(11) default NULL,

  PRIMARY KEY  (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*���ݱ� `t_user` ������*/

insert into `t_user` values (1,'tiemei',1),(2,'tiemei',2);

##2. ���� com.tiemei.demo.ibatis.least.mpas.SqlMapConfig.xml���ݿ��������
##2. ����com.tiemei.demo.ibatis.least.ExampleMain.java
