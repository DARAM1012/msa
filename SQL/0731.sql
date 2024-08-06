select bookname
from book
where price=(select max(price)from book);

insert into table_name values(1,'다람이','대한민국 ','010-0000-0000');

select*from table_name where custid=1;

update table_name set 변경할 내용 where 조건;

create 테이블이름

create datebase 데이터베이스이름

-- 테이블 만들기 --
create table NewBook(
			 bookid integer primary key,
             bookname varchar(20),
             publisher varchar(20),
             price integer,
             primary key (bookname,publisher));
             
-- Code Table 사용자에게 보내줄, 또는 시스템 프론트개발자 등등 에게 보내줄 메세지 -- 
-- id_1 : 대분류 -> 0 : 회원가입관련
-- id_2 : 중분류 -> 0 :회원가입 1:로그인/로그아웃
-- id_3 : 소분류 -> 0: 가입성공
-- msg : 출력될 내용
-- create table tblCode(
-- 			id_1 char(2) not null,
-- 			id_2 char(2) not null,
-- 			id_3 char(3) not null,
--             msg varchar(60) not null,
--             primary key (id_1,id_2,id_3) -- 복합키 1,2,3번이 합쳐져야 하나가 됨
-- );

-- insert into tblCode('00','00','000','회원가입을 환영합니다.');
-- insert into tblCode('00','01','001','로그인되었습니다.');
-- insert into tblCode('0','1,'2','로그아웃되었습니다.');
-- insert into tblCode('00','00','001','중복된 아이디입니다.');

create table NewCustomer(
					custid integer,
                    name varchar(40),
                    address varchar(40),
                    phone varchar(30)
);
-- 외래키
create table NewOrders(
					orderid integer,
                    custid integer not null, 
                    bookid integer not null,
                    saleprice integer,
                    orderdate date,	
                    primary key(orderid),
                    foreign key(custid) references NewCustomer(custid) on delete cascade);
                    -- on delete cascade 고객이 탈퇴를 했지만, 리뷰쓴게 남아있으면 그걸 삭제해줌
             
             
describe newbook;

alter table NewBook add isbn varchar(13);
alter table NewBook modify isbn integer;
alter table NewBook drop isbn;
alter table NewBook modify bookname varchar(20) not null;
alter table NewBook add primary key (bookname,publisher); 
drop table NewBook; -- 삭제하는 것, 날려버려

-- update NewBook set bookname='하하' where bookid='2' 싹다 하하로 이름 수정됨
-- delete from NewBook where bookid='1'; 1번만 삭제

INSERT INTO Book(bookid,bookname,publisher,price)
VALUES(11,'스포츠의학','한솔의학서적',90000);

select*from book;

-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name,publisher
from customer,book,orders
where  (name = '박지성') && (customer.custid=orders.custid) && (book.bookid=orders.bookid)
union
 select customer.name, book.publisher
from customer,book,orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid) && (publisher = '굿스포츠');
 
-- 도서를 구매한 고객이름과 출판사
select name, publisher
from customer, book, orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid)
 order by customer.name;
 
-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name, publisher
from customer,book,orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid);

select name
from customer
where name not in ('추신수%');


-- 3) 전체 고객의 30%이상이 구매한 도서

