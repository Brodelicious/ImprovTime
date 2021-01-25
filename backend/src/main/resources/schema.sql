drop table if exists improv_character cascade;
drop table if exists setting cascade;
drop table if exists activity cascade;

create table improv_character(
	id serial primary key,
	name varchar unique not null
);

create table setting(
	id serial primary key,
	name varchar unique not null
);

create table activity(
	id serial primary key,
	name varchar unique not null
);