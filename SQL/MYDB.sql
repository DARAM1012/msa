create database MYMH;
use MYMH;

create table Director(
 d_id integer NOT NULL PRIMARY KEY,
 d_name	varchar(10)	NOT NULL,
 d_gender char(1)	NULL
);

create table Actor(
 a_id integer NOT NULL PRIMARY KEY,
 a_name	varchar(10)	NOT NULL,
 a_nikname	varchar(10)	NOT NULL,
 a_gender char(1)	NULL
);

create table Movie(
 m_id integer NOT NULL PRIMARY KEY,
 m_name varchar(30) NOT NULL,
 m_genre varchar(15) NOT NULL,
 o_date date NOT NULL,
 outline varchar(50) NOT NULL
);

create table Users(
u_id integer NOT NULL PRIMARY KEY,
u_nikename varchar(20) NOT NULL
);

create table Rating(
star int NOT NULL,
m_id integer,
u_id integer,
foreign key (m_id) references Movie(m_id),
foreign key (u_id) references Users(u_id),
PRIMARY KEY (m_id, u_id)
);

create view movie_drector
as select D.d_id AS Drector_id,M.m_id AS Movie_id
from Director d
join Movie m ON D.d_id = M.m_id;

create view movie_actor
as select A.a_id AS Actor_id,M.m_id AS Movie_id
from Actor a
join Actor a ON A.a_id = M.m_id;

