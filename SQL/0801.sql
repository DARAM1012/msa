select ABS(-78), ABS(78);

select round(4.875,1); -- 1은 소수자리 첫째자리까지 살려라

select concat('마당','서점');

select lower('MR.SCOTT');

select upper('mr.scott');

select lapad('Page 1', 10,"*");

select replace('jack & jue','j','bl');

select substr('ABCDEFG',3,4); -- 3은 3번째부터 4는 4개를 잘라와라

select trim('=' from "= A= B= C= D= E="); -- 양 끝 자르기

select adddate('2024-07-01',interval -5 day) before5,
	   adddate('2024-07-01',interval 5 day) after5;

--  고객별 평균 주문 금액을 100원 단위로 반올림한 값을 구하세요 --
select name, round(avg(saleprice/100))*100 as '평균주문금액' -- round(avg(saleprice),-2) as average
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name;

-- 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 나타내시오
select bookname,replace(bookname,'야구','농구')
from book
where bookname like '야구%';

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 출력하세요.

-- 마당서점의 고객 중에서 성이 같은 사람이 몇명이나 되는 지 알고 싶다. 성별 인원수를 구하시오.
select substr(name,1,1) '성', count(*) '인원'
from customer
group by substr(name,1,1);

-- 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하세요
select adddate(orderdate,interval 10 day) as '주문10일후'
from orders;

-- 2024 7월 4일 주문받은 도서를 모두 나타내세요. 단 주문일은 240704,Jul 04 2024,24-07-04 Thu 형태로.
select orderid '주문번호',date_format(orderdate, '%Y-%m-%d')'주문일',
		custid '고객번호', bookid '도서번호'
from orders
where orderdate=str_to_date('20240704','%Y%m%d');

-- 뷰 생성문
create view vorders
as select orderid, O.custid,name,O.bookid,bookname,saleprice,orderdate
from customer C, orders O,book B
where C.custid=O.custid and B.bookid=O.bookid;

select*from vorders;

-- 대한민국에 거주하는 고객들로 구성된 뷰를 만들고 조회하세요. 뷰 이름은 vw_Customer
create view vw_Customer
as select *
from customer 
where address like '대한민국%';

-- Orders 테이블에서 고객명과 도서명을 확인할 수 있는 뷰를 생성한 후, 김연아 고객이 구입한 도서의 주문번호,도서명,주문액을 출력하세요.
create view I_wanna_go_home
as select od.orderid, od.custid, cs.name,
		od.bookid, bk.bookname, od.saleprice, od.orderdate
from orders od,customer cs,book bk
where od.custid=cs.custid and od.bookid=bk.bookid;

select*from I_wanna_go_home;

select orderid,bookname,saleprice
from I_wanna_go_home
where name='김연아';

create table Mybook(
		bookid INTEGER PRIMARY KEY,
        price INTEGER

);
INSERT INTO Mybook VALUES(1,10000);
INSERT INTO Mybook VALUES(2,20000);
INSERT INTO Mybook VALUES(3,NULL); 
-- INSERT INTO Mybook (bookid) VALUES(3);


select price+100
from Mybook
where bookid=3;

select * from Mybook;

select sum(price),avg(price),count(*), count(price)
from Mybook
where bookid >=4; 

select *
from Mybook
where price is null;

select count(*)
from Mybook
where price is null;

select *
from Mybook
where price='';

-- 이름,전화번호가 포함된 고객 목록을 나타내시오. 단, 전화번호가 없는 고객은 '연락처없음'으로 표시하시오.
select name '이름',IFNULL(phone,'연락처없음') '전화번호'
from Customer;

select bookid '이름',IFNULL(price,'가격미입력') 'price'
from Mybook;


