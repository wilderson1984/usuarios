drop table if exists usuarios
drop table if exists hibernate_sequence
create table usuarios (id int not null, primary key (id), cpf int, name varchar(255), email varchar(255), profissao varchar(255), genero varchar(255), endereco varchar(255), dt_nasc date) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )