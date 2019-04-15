drop table if exists USUARIOS
drop table if exists hibernate_sequence
create table USUARIOS (ID int not null, primary key (ID), CPF int, NAME varchar(255), EMAIL varchar(255), PROFISSAO varchar(255), GENERO varchar(255), ENDERECO varchar(255), DT_NASC date) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )