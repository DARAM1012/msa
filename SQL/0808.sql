delimiter //
create procedure dorepeat(p1 int)
	begin
		set @x = 0;
        repeat set @x = @x + 1; until @x > p1 end repeat;
        END //
        
        call dorepeat(1000);
        
        select @x;
        
        use madangdb;
        delimiter //
create procedure InsertBook(
	IN mybookid INTEGER,
    IN mybookname varchar(40),
    IN mypublisher varchar(40),
    IN myprice integer)
BEGIN
	insert into Book(bookid, bookname, publisher, price)
       values(mybookid, mybookname, mypublisher, myprice);
			
end;
//
delimiter ;
            
-- 프로시저 InsertBook을 테스트하는 부분
CALL InsertBook(13, '스포츠과학', '마당과학서적', 25000);
select * from Book;

use madangdb;
delimiter //
create procedure BookInsertOrUpdate(
	mybookid INTEGER,
    mybookname varchar(40),
    mypublisher varchar(40),
    myprice int)
BEGIN
	declare mycount INTEGER;
    select count(*) INTO mycount FROM Book
    WHERE bookname LIKE mybookname;
    IF mycount!=0 THEN
		set SQL_SAFE_UPDATES=0; -- 연산에 필요한 설정문
        UPDATE Book SET price = myprice
        WHERE bookname LIKE mybookname;
	else
		INSERT INTO Book(bookid, bookname, publisher, price)
			VALUE(mybookid,mybookname,mypublisher,myprice);
	END IF;
END;
//
delimiter ;

call BookInsertOrUpdate(15,'스포츠 즐거움','마당과학서적',25000);
select*from book;
call BookInsertOrUpdate(15,'스포츠 즐거움','마당과학서적',20000);
select*from book;

delimiter //
create procedure Averageprice(
	out averageVal integer)
begin
	select avg(price) into AverageVal
    from book where price is not null;
    end;
    //
    delimiter ;
    
    call Averageprice(@myValue);
    select @myValue;
    
set global log_bin_trust_function_creators=ON;    
create table Book_log(
		bookid_l integer,
        bookname_l varchar(40),
        publisher_l varchar(40),
        price_l integer);
        
delimiter //
create TRIGGER AfterInsertBook
	after insert on book for each row
begin
	declare average integer;
    insert into book_log
    values(new.bookid, new.bookname,new.publisher,new.price);
    end;
    //
    delimiter ;
    
    insert into book values(14,'스포츠 과학 1','이상미디어',25000);
    select*from book where bookid=14;
    select*from book_log where bookid_l='14'; -- 결과 확인
