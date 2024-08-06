create database highschool;

use highschool;

CREATE TABLE STUDENT(
s_id integer auto_increment primary key,
s_name VARCHAR(40) NOT NULL,
s_year char(4) NOT NULL,
s_grade varchar(10) NOT NULL,
s_class varchar(20) NOT NULL,
s_num varchar(40) NOT NULL,
s_pass varchar(20) NOT NULL default '1234',
PRIMARY KEY (s_year,s_grade,s_class,s_num)
);

create table TEACHER (
t_ID varchar(20) NOT NULL PRIMARY KEY,
t_pass varchar(20) not null,
t_name varchar(40) not null,
t_subject varchar(20) not null,
t_type int(1) null default 9
);

create table LESSON(
l_ID integer auto_increment PRIMARY KEY,
l_name varchar(30) not null,
l_year char(4) not null,
l_grade varchar(2) not null,
l_semeter varchar(10) not null,
l_class varchar(2) null,
l_day char(10) not null,
l_time varchar(6) not null,
l_room varbinary(20) not null,
FOREIGN KEY (t_ID) REFERENCES TEACHER(t_ID)
);

create table chulsuk(
l_ID integer not null,
s_ID integer not null,
primary key(l_id, s_id),
foreign key(s_id) references student(s_id),
foreign key(l_id) references lesson(l_id)
);

create table PERFORM(
p_id integer auto_increment primary key,
p_title varchar(100) not null,
p_type char(1) not null,
p_content tinytext not null,
p_kijun varchar(100) null,
p_start date not null,
p_end date not null,
l_id integer not null,
foreign key(l_id) references lesson(l_id)
);

create table evaluation(
l_id integer not null,
s_id integer not null,
p_id integer not null,
e_score integer not null,
e_check char(1) null,
e_checkdate date null,
primary key(l_id,p_id,s_id),
foreign key(l_id) references lesson(l_id),
foreign key(p_id) references perform(p_id),
foreign key(s_id) references student(s_id),
foreign key(p_id) references perform(p_id)
);