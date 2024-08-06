use madangdb;


-- 만원 이상 이만원 이하 책이름 및 출판사 찾기 --  
select bookname , publisher, price from Book
where 10000 <= price && price <= 20000;


 -- 중복되는 것 빼고 찾기 -- 
select publisher from book;

select distinct publisher from book;

-- null 아닌거 찾기 -- 
select name,phone from Customer
where phone is not null;

-- 출판사가 굿스포츠, 가격이 10000이상 20000미만-- 
select bookname,publisher,price from book
where (publisher = '굿스포츠') and (price between 10000 and 20000);

-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하세요 --
select bookname,publisher from book
where (publisher = '굿스포츠') or (publisher = '대한미디어');

-- 출판사가 '굿스포츠' 혹은 '대한미디어'가 아닌 도서를 검색하세요-- 
select bookname,publisher from book
where publisher not in ('굿스포츠','대한미디어');

-- 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서를 검색하시오 -- 
-- 책이름의 첫번째 글자 상관하지 않고, 두번째 글자가 구인 모든 책-- 
select * from book
where bookname like '_구%';

-- 데이터 수정하는 법 -- 
update book
set bookname='그 여자의 축구'
where bookid=2;

-- 테이블에 있는 기존 투플을 삭제하는 명령 --
delete from book
where bookid=2;

-- 전체 칼럼 보기
 select * from madangdb.book;
 SELECT * FROM Orders;
 select * from Customer;
 
 -- 원하는 칼럼 보기 --
-- select name, address from Customer;-- 
select bookname, publisher from Book;

select publisher, bookname from Book
where bookname like '%축구%';

 -- 오름차순 --
 select * from book
 order by bookname asc;
 
 -- 내림차순 -- 
  select * from book
 order by bookname desc;

select*from book
order by price;

select*from book
order by price, bookname;

-- 고객이 주문한 도서의 총판매액 -- 
select sum(saleprice) from orders;
select  count(saleprice) from orders;
select  max(saleprice) from orders;
select  min(saleprice) from orders;


-- 프라이스로 적지말고 판매가격으로 출력해줘(사용자가 보기 편하게해주려고) -- 
select price as '판매가격' from book;

select sum(saleprice) as total,
	   avg(saleprice) as average,
       min(saleprice) as minimum,
       max(saleprice) as maximum
       from orders;
       
       select count(*) from orders;
       
-- 고객별(group by 고객)로 주문한 도서의 총수량(count)과 총판매액(sum)을 구하시오 -- 
select custid, count(*) as '총수량',
sum(saleprice) as '총판매액'
from orders
group by custid;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별(group by custid) 주문 도서의 총수량(count)을 구하시오. -- 
-- 단 2권이상 구매한 고객에 대해서만 구하시오.-- 
select custid, count(*) as '총수량'
from orders
where  saleprice >= 8000
group by custid
having count(*) >= 2;

-- (조인) 한 테이블의 행을 다른 테이블의 행에 연결해 두 개 이상의 테이블을 결합하는 연산 -- 
--  예) Customer 테이블을 orders 테이블과 조건없이 연결함 -- 
select *
from customer, orders;

-- 고객과 고객의 주문에 관한 데이터를 모두 나타내시오. (조건을 붙일 경우) -- 
-- 테이블.칼럼이름=테이블.칼럼이름 --
select *
from customer, orders
where customer.custid=orders.custid;

-- 고객과 고객의 주문에 관한 데이터를 고객별로 나타내시오. --
select *
from customer, orders
where customer.custid=orders.custid
order by customer.custid;

-- 고객별로 주문한 모든 도서의 총판매액을 구하고, 고객별로 연결하시오 --
select name,sum(saleprice)
from customer,orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별(group by custid) 주문 도서의 총수량(count)을 구하시오. --
select name,count(*)
from customer,orders
where (customer.custid=orders.custid) and (saleprice >= 8000)
group by customer.name
order by customer.name;

-- 고객의 이름과 고객의 주문한 도서의 이름을 구하세요. --
select name, book.bookname
from customer, book, orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid)
order by book.bookname;

-- 가격이 2만원 이상인 책을 주문한 고객의 이름과 주문한 도서의 이름을 구하세요 --
select name, book.bookname,price
from customer,book,orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid) and (price >= 20000)
order by book.bookname;

-- 도서번호가 1인 도서의 이름 --
select book.bookname
from book
where  bookid = 1

-- 가격이 2만원 이상인 도서의 이름 -- 
select book.bookname,price
from book,orders
where price >= 20000;

-- 박지성의 총 구매금액 --
select name,sum(saleprice)
from customer,orders
where (name = '박지성') and (customer.custid=orders.custid);

-- 박지성이 구매한 도서의 수 --
select name,count(*)
from customer,orders
where (name = '박지성') and (customer.custid=orders.custid);

-- 박지성이 구매한 도서의 출판사 수 --
select name,count(publisher)
from customer,book,orders
where (name = '박지성') and (customer.custid=orders.custid) and  (book.bookid=orders.bookid);

-- 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이 --
select name,book.bookname,price,price-saleprice as '정가와 판매가격의 차이'
from customer,book,orders
where (name = '박지성') and (customer.custid=orders.custid) and  (book.bookid=orders.bookid);

-- 박지성이 구매하지 않은 도서의 이름 --
select name,book.bookname
from customer,book,orders
where (customer.custid=orders.custid) and  (book.bookid=orders.bookid) 
and customer.name not in ('박지성');  
-- orders.custid not in (1); --
-- customer.name != '박지성' --
-- customer.name <>'박지성' --


-- 마당서점 도서의 총개수 --
select count(*) as '총수량'
from book;

-- 마당서점에 도서를 납품하는 출판사의 총개수 --


-- 모든 고객의 이름, 주소 --
select name,address
from customer;

-- 2024년 7월 4일부터 2024년 7월7일 사이에 주문된 도서의 목록 --
select orderdate,bookname
from book,orders
where (book.bookid=orders.bookid) && orderdate between '2024-7-4' and '2024-7-7';

-- 성이 김씨인 고객의 이름과 같은 주소 --
select name,address
from customer
where name like '김%' ;

-- 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소 --
select name,address
from customer
where name like '김%' and name like '%아';

-- 주문 금액의 총액과 평균 금액 --
select sum(saleprice) as total,
	   avg(saleprice) as average
from orders;

-- 고객의 이름과 고객별 구매액 -- 
select name,sum(saleprice)
from customer, orders
where customer.custid=orders.custid
group by customer.name;

-- 고객의 이름과 고객이 구매한 도서목록 --
select name,bookname
from customer, book,orders
where customer.custid=orders.custid and book.bookid=orders.bookid
order by customer.name;

-- 가장 비싼 도서의 이름? (서브쿼리 사용법)--
select bookname , price
from book
where price = (select max(price)from book);

-- 도서를 구매한 이력이 있는 고객명(서브쿼리) --
select name
from customer
where custid in(select distinct custid from orders);

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 출력하세요.(조인 사용할 경우)  --

select customer.name, book.publisher
from customer,book,orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid) && (publisher = '대한미디어');

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 출력하세요.(서브쿼리 사용할 경우) --
select customer.name from customer
where
custid in (select custid from orders where
bookid in (select bookid from book where publisher='대한미디어');

-- 15번 문제 복습)고객의 이름과 고객별 구매액 --
select name,sum(orders.saleprice) as '구매금액'
from customer,orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

-- 대한민국에 거주하시는 고객리스트 출력 --
select name
from customer
where address like '대한민국%';


-- 도서를 주문한 고객리스트 출력(서크쿼리 사용) --  
select name
from customer
where custid in(select custid from orders);

-- 대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하세요 --
-- 3명
select name
from customer
where address like '대한민국%'
union all
-- 4명
select name
from customer
where custid in(select custid from orders);

-- 주문이 있는 고객의 이름과 주소를 나타내시오 --
select name,address
from customer cs
where exists(select *
			 from orders od
			 where cs.custid=od.custid);
             


             

             
