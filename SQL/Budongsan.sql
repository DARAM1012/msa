create database MDbudongsan;

use MDbudongsan;

create table Budongsan(
	B_num integer(10), -- 부동산소유(필지번호,주민번호)
    address varchar(40), -- 부동산필지(필지번호,공시지가,주소)
    b_ssn integer(15) -- 소유자(주민등록번호, 소유자이름, 전화번호)

);