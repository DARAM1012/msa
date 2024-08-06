show databases;

use mysql;

show tables;

desc user;

select * from user;

create user green@localhost identified by '941012';

create user greenguest@localhost identified by '941012';

drop user green@localhost;

create user mdgest2 identified by '1234';

grant all privileges on madanguv.* to green@localhost;

flush privileges;

show grants for green@localhost;

grant select on madangdb.book to green@localhost;
flush privileges;
select * from user;
