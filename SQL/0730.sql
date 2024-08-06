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
where (customer.custid=orders.custid) and  (book.bookid=orders.bookid) and orders.custid not in (1);

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