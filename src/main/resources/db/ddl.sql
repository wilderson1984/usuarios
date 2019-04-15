drop table if exists usuarios
drop table if exists hibernate_sequence
create table usuarios (id int not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )