create database university;

use university;

create table Professor(
p_ssn integer auto_increment primary key,
p_name varchar(30) not null,
p_age varchar(3) not null,
p_rank varchar(20) not null,
p_speciality varchar(20) not null,

);

create table Department(
dno integer NOT NULL,
dname varchar(20) not null,
office varchar(20) not null,
p_ssn integer not null,
foreign key(p_ssn) references professor(p_ssn),
PRIMARY KEY (dno)
);

create table Graduate(
g_ssn integer auto_increment primary key,
g_name varchar(20) not null,
g_age varchar(3) not null,
g_deg_prog varchar(20) not null,
advisor varchar(10) null,
foreign key (advisor) references Graduate(g_ssn)
);


create table Project(
pid integer NOT NULL,
sponsor varchar(20) not null,
start_date date not null,
end_date date not null,
budget integer not null,
manage integer not null,
foreign key (manage) references professor(mange),
PRIMARY KEY (pid)
);

create table work_dept(
pct_time varchar(3) not null,
p_ssn integer not null,
dno integer NOT NULL,
 foreign key(p_ssn) references professor(p_ssn),
 foreign key(dno) references Department(dno),
 PRIMARY KEY (p_ssn,dno) -- 안겹치는 애들은 프라이머리 키 써야됨
);

create table work_in(
pid integer NOT NULL,
p_ssn integer not null,
foreign key(pid) references project(pid),
 foreign key(p_ssn) references professor(p_ssn),
primary key(pid,p_ssn)
);

create table work_prog(
pid integer NOT NULL,
g_ssn integer not null,
foreign key(pid) references project(pid),
 foreign key(g_ssn) references Graduate(g_ssn),
primary key(pid,g_ssn)
);



drop table work_dept,Project; -- 테이블 만든거 삭제


