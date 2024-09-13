create database MYMH2;
use MYMH2;

CREATE TABLE Director (
  d_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  d_name VARCHAR(10) NOT NULL,
  d_gender CHAR(1) NULL
);

INSERT INTO Director(d_name,d_gender) VALUES('박찬욱','남');
INSERT INTO Director(d_name,d_gender) VALUES('나홍진','남');
INSERT INTO Director(d_name,d_gender) VALUES('최동훈','남');
INSERT INTO Director(d_name,d_gender) VALUES('류승완','남');
INSERT INTO Director(d_name,d_gender) VALUES('강제규','남');
INSERT INTO Director(d_name,d_gender) VALUES('김지운','남');
INSERT INTO Director(d_name,d_gender) VALUES('양우석','남');
INSERT INTO Director(d_name,d_gender) VALUES('윤종빈','남');
INSERT INTO Director(d_name,d_gender) VALUES('이병헌','남');
INSERT INTO Director(d_name,d_gender) VALUES('김용화','남');
INSERT INTO Director(d_name,d_gender) VALUES('봉준호','남');
INSERT INTO Director(d_name,d_gender) VALUES('강우석','남');
INSERT INTO Director(d_name,d_gender) VALUES('이정향','여');
INSERT INTO Director(d_name,d_gender) VALUES('장진','남');
INSERT INTO Director(d_name,d_gender) VALUES('장훈','남');
INSERT INTO Director(d_name,d_gender) VALUES('공수창','남');
INSERT INTO Director(d_name,d_gender) VALUES('김대승','남');
INSERT INTO Director(d_name,d_gender) VALUES('김성수','남');
INSERT INTO Director(d_name,d_gender) VALUES('김태균','남');
INSERT INTO Director(d_name,d_gender) VALUES('조성희','남');
INSERT INTO Director(d_name,d_gender) VALUES('백종열','남');
INSERT INTO Director(d_name,d_gender) VALUES('배종(박광현)','남');
INSERT INTO Director(d_name,d_gender) VALUES('송해성','남');
INSERT INTO Director(d_name,d_gender) VALUES('이명세','남');
INSERT INTO Director(d_name,d_gender) VALUES('박범수','남');
INSERT INTO Director(d_name,d_gender) VALUES('김한결','여');
INSERT INTO Director(d_name,d_gender) VALUES('유하','남');
INSERT INTO Director(d_name,d_gender) VALUES('장윤현','남');
INSERT INTO Director(d_name,d_gender) VALUES('정윤철','남');
INSERT INTO Director(d_name,d_gender) VALUES('노덕','남');
INSERT INTO Director(d_name,d_gender) VALUES('정지우','남');
INSERT INTO Director(d_name,d_gender) VALUES('이환경','남');
INSERT INTO Director(d_name,d_gender) VALUES('김한민','남');
INSERT INTO Director(d_name,d_gender) VALUES('추창민','남');
INSERT INTO Director(d_name,d_gender) VALUES('연상호','남');
INSERT INTO Director(d_name,d_gender) VALUES('이일형','남');
INSERT INTO Director(d_name,d_gender) VALUES('한재림','남');
INSERT INTO Director(d_name,d_gender) VALUES('황동혁','남');
INSERT INTO Director(d_name,d_gender) VALUES('강형철','남');
INSERT INTO Director(d_name,d_gender) VALUES('김성훈','남');
INSERT INTO Director(d_name,d_gender) VALUES('곽경택','남');
INSERT INTO Director(d_name,d_gender) VALUES('문병곤','남');
INSERT INTO Director(d_name,d_gender) VALUES('이창동','남');
INSERT INTO Director(d_name,d_gender) VALUES('이준익','남');
INSERT INTO Director(d_name,d_gender) VALUES('윤제균','남');
INSERT INTO Director(d_name,d_gender) VALUES('이상용','남');
INSERT INTO Director(d_name,d_gender) VALUES('홍상수','남');
INSERT INTO Director(d_name,d_gender) VALUES('정범식','남');
INSERT INTO Director(d_name,d_gender) VALUES('이연우','남');
INSERT INTO Director(d_name,d_gender) VALUES('장재현','남');
INSERT INTO Director(d_name,d_gender) VALUES('함영선','여');


CREATE TABLE Actor (
  a_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  a_name VARCHAR(10) NOT NULL,
  a_gender CHAR(1) NULL
);

-- 배우 테이블에 삽입
INSERT INTO Actor (a_name, a_gender) VALUES ('김민희', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('하정우', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('송강호', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김옥빈', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('최민식', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('유지태', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('황정민', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('곽도원', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김윤석', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김수현', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('전지현', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('조승우', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김혜수', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('소지섭', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('송중기', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('유아인', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('류승룡', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이광수', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('장동건', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('원빈', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('한석규', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김윤진', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('오다기리 조', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('장혁', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('심은경', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('현빈', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('강지환', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('박소담', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('크리스 에반스', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('박해일', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('정재영', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김예원', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('박신혜', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('김고은', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('갈소원', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('설경구', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('정유미', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('주지훈', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김상중', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이종석', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김재중', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('한예슬', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('공효진', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('유승호', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('강호동', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('마동석', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이병헌', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('정해인', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이서진', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('신하균', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이정은', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('이정재', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('류승완', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('조진웅', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('공유', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('정우성', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('강동원', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김향기', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('이성민', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이하늬', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('김우빈', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('차태현', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김래원', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('강성진', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('조정석', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('유해진', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('조재현', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('고수', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김명민', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김소연', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('김무열', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('박보영', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('오정세', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김태리', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('한효주', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('박서준', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('차승원', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김주혁', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이영애', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('이주명', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('한지민', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('박중훈', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('안성기', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('이민기', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('나문희', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('유호정', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('배두나', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('이선균', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('유오성', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('전도연', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('이준기', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('하지원', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('윤계상', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('김의성', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('박진성', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('위하준', '남');
INSERT INTO Actor (a_name, a_gender) VALUES ('박지현', '여');
INSERT INTO Actor (a_name, a_gender) VALUES ('탁태호', '남');




CREATE TABLE Movie (
  m_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  m_name VARCHAR(30) NOT NULL,
  m_genre VARCHAR(15) NOT NULL,
  o_date DATE NOT NULL,
  outline VARCHAR(1000) NOT NULL
);

INSERT INTO Movie ( m_name,  m_genre, o_date,  outline) VALUES
('아가씨', '드라마', '2016-06-01', '일제 강점기, 두 여성의 복수와 사랑을 그린 영화.'),
('박쥐', '드라마', '2009-07-30', '가톨릭 신부가 되기를 꿈꾸던 남자가 뱀파이어로 변하는 이야기.'),
('올드보이', '스릴러', '2003-11-21', '15년 동안 감금된 남자가 복수를 위해 추적하는 이야기.'),
('곡성', '미스터리', '2016-05-12', '조용한 마을에서 일어난 연쇄 살인 사건을 둘러싼 이야기.'),
('황해', '액션', '2012-11-22', '북한에서 온 남자가 한국에서의 생존을 위해 싸우는 이야기.'),
('추격자', '스릴러', '2008-01-17', '연쇄 살인범과 그의 추격자를 다룬 스릴러.'),
('암살', '액션', '2015-07-22', '일제 강점기, 한국 독립운동가들의 암살 작전을 그린 영화.'),
('도둑들', '액션', '2012-07-25', '전문 도둑들이 함께 큰 사건을 해결하는 이야기.'),
('타짜', '드라마', '2006-09-28', '도박판에서의 치열한 싸움을 그린 이야기.'),
('군함도', '전쟁', '2017-07-26', '일제 강점기의 군함도에서의 탈출을 그린 이야기.'),
('베테랑', '액션', '2015-08-05', '경찰과 부유한 재벌가의 충돌을 그린 액션 영화.'),
('부당거래', '스릴러', '2010-10-21', '법정과 범죄 세계를 배경으로 한 스릴러.'),
('태극기 휘날리며', '전쟁', '2004-07-22', '한국 전쟁을 배경으로 한 형제의 이야기.'),
('쉬리', '액션', '1999-07-22', '북한 여성 요원이 한국에서 임무를 수행하는 이야기.'),
('마이웨이', '전쟁', '2011-12-21', '한국 전쟁과 제2차 세계대전을 배경으로 한 전쟁 드라마.'),
('밀정', '액션', '2016-09-07', '일제 강점기의 한국 독립운동과 일본 경찰의 추적을 그린 이야기.'),
('좋은 놈, 나쁜 놈, 이상한 놈', '액션', '2008-07-17', '서부극 스타일의 액션과 코미디가 어우러진 영화.'),
('반칙왕', '코미디', '2004-06-24', '배드민턴 선수의 좌충우돌 이야기.'),
('강철비 시리즈', '액션', '2017-12-14', '북한과 남한의 정치적 긴장을 다룬 액션 시리즈.'),
('변호인', '드라마', '2013-12-18', '재판과 인권 문제를 다룬 드라마.'),
('공작', '스릴러', '2018-08-08', '북한의 스파이와 한국의 정보를 다루는 이야기.'),
('범죄와의 전쟁', '드라마', '2012-01-11', '조직 범죄와의 전쟁을 다룬 드라마.'),
('용서받지 못한자', '스릴러', '2010-12-15', '복수를 다룬 스릴러 영화.'),
('극한 직업', '코미디', '2019-01-23', '형사들이 마약 밀매 조직을 잡기 위해 음식점을 운영하는 이야기.'),
('바람 바람 바람', '로맨스', '2019-04-25', '세 명의 남자와 여자 사이의 복잡한 사랑 이야기.'),
('스물', '코미디', '2015-03-25', '20대의 삶과 사랑을 그린 코미디.'),
('신과함께 시리즈', '판타지', '2017-12-20', '사후 세계와 재판을 다룬 판타지 드라마.'),
('미스터 고', '판타지', '2013-07-17', '거대한 고릴라와 그의 인간 친구의 이야기.'),
('국가대표', '드라마', '2009-07-22', '국제 스포츠 대회에 참가하는 한국 축구 대표팀의 이야기.'),
('기생충', '드라마', '2019-05-30', '빈부 격차를 다룬 가족 드라마.'),
('설국열차', 'SF', '2013-08-01', '지구가 얼어붙은 미래 사회를 배경으로 한 SF 영화.'),
('해무', '스릴러', '2014-08-13', '해상 밀매를 다룬 스릴러.'),
('이끼', '드라마', '2010-09-16', '미스터리와 드라마가 어우러진 이야기.'),
('주유소 습격 사전2', '코미디', '2020-08-06', '주유소를 배경으로 한 코미디 시리즈의 두 번째 이야기.'),
('깡철이', '액션', '2008-12-31', '부패 경찰과 싸우는 깡철이의 이야기.'),
('집으로', '드라마', '2002-10-10', '북한의 소년과 한국의 가족을 다룬 드라마.'),
('오늘', '드라마', '2011-08-11', '하루 동안의 사건을 그린 드라마.'),
('우리는 형제입니다', '드라마', '2013-12-24', '형제간의 갈등과 화해를 그린 이야기.'),
('하이힐', '드라마', '2017-08-30', '여성의 사회적 성공과 개인적 갈등을 다룬 드라마.'),
('바라던 바다', '드라마', '2019-10-30', '바다를 배경으로 한 개인의 성장 이야기.'),
('택시운전사', '드라마', '2017-08-02', '1980년 광주 민주화 운동을 배경으로 한 이야기.'),
('의형제', '드라마', '2010-06-17', '형제 같은 우정을 다룬 드라마.'),
('고지전', '전쟁', '2011-07-20', '한국 전쟁의 고지전투를 다룬 영화.'),
('알포인트', '스릴러', '2004-12-23', '밀리터리 스릴러.'),
('조선마술사', '사극', '2015-10-08', '조선시대의 마술과 사랑을 그린 사극.'),
('혈의 누', '스릴러', '2010-06-17', '살인과 복수를 다룬 스릴러.'),
('서울의 봄', '드라마', '2011-06-09', '서울의 봄을 배경으로 한 드라마.'),
('아수라', '액션', '2016-09-28', '부패와 폭력을 다룬 액션 영화.'),
('감기', '스릴러', '2013-08-14', '감염병을 다룬 스릴러.'),
('암수살인', '스릴러', '2018-10-03', '범죄와 심리를 다룬 스릴러.'),
('늑대소년', '판타지', '2012-11-21', '늑대 인간과 사랑을 그린 판타지.'),
('탐정 홍길동', '코미디', '2004-09-30', '홍길동을 모티브로 한 코미디 영화.'),
('승리호', 'SF', '2021-02-05', '우주를 배경으로 한 SF 영화.'),
('뷰티 인사이드', '로맨스', '2015-08-20', '매일 다른 모습으로 변하는 남자와의 사랑 이야기.'),
('독전2', '액션', '2024-03-15', '마약 밀매와 범죄를 다룬 액션 시퀄.'),
('웰컴투동막골', '코미디', '2005-08-11', '전쟁과 농촌을 배경으로 한 코미디.'),
('우리들의 행복한 시간', '드라마', '2006-09-27', '우울증을 앓고 있는 남녀의 만남과 성장 이야기.'),
('고령화 가족', '드라마', '2013-06-05', '가족의 노화와 갈등을 다룬 드라마.'),
('나의 사랑, 나의 신부', '로맨스', '2014-01-23', '결혼을 앞둔 커플의 이야기.'),
('빅토리', '스포츠', '2007-05-31', '축구를 주제로 한 스포츠 드라마.'),
('파일럿', '액션', '2019-07-12', '파일럿과 그의 임무를 다룬 액션.'),
('가장 보통의 연애', '로맨스', '2019-10-31', '평범한 연애와 갈등을 그린 이야기.'),
('하울링', '공포', '2012-06-14', '늑대 인간을 주제로 한 공포 영화.'),
('쌍화점', '사극', '2005-12-22', '조선시대의 궁중 음모를 다룬 사극.'),
('말죽거리 잔혹사', '드라마', '2004-01-29', '고등학교 시절의 폭력과 갈등을 그린 드라마.'),
('당신이 잠든 사이', '로맨스', '2016-09-27', '꿈과 현실을 다룬 로맨스 드라마.'),
('황진이', '사극', '2007-12-20', '조선시대의 유명한 기생 황진이의 이야기.'),
('라디오스타', '코미디', '2006-01-19', '라디오 방송을 배경으로 한 코미디 영화.'),
('내 심장을 쏴라', '액션', '2011-06-15', '암살자와의 싸움을 다룬 액션.'),
('연애의 온도', '로맨스', '2018-02-14', '연애의 따뜻함과 갈등을 다룬 영화.'),
('지구를 지켜라', '코미디', '2003-08-14', '지구를 구하기 위한 코미디 SF 영화.'),
('특종', '스릴러', '2015-08-27', '뉴스 보도와 범죄를 다룬 스릴러.'),
('은교', '드라마', '2012-05-09', '노인과 젊은 여성의 복잡한 관계를 그린 드라마.'),
('7번방의 선물', '드라마', '2013-01-23', '사형수와 그의 딸을 다룬 드라마.'),
('명량', '전쟁', '2014-07-30', '이순신 장군의 명량 해전을 다룬 전쟁 영화.'),
('노량', '전쟁', '2019-11-07', '노량 해전을 배경으로 한 전쟁 드라마.'),
('광해', '사극', '2012-09-13', '광해군의 실체를 그린 사극.'),
('행복의 나라', '드라마', '2015-06-04', '행복을 찾아가는 이야기.'),
('부산행', '좀비', '2016-07-20', '좀비 재난 상황에서의 생존을 그린 이야기.'),
('검사외전', '액션', '2016-02-03', '검사와 범죄자의 충돌을 다룬 액션.'),
('관상', '사극', '2013-09-11', '조선시대의 관상을 다룬 사극.'),
('수상한 그녀', '코미디', '2014-01-22', '어린 시절의 여성이 다시 젊은 시절로 돌아가는 이야기.'),
('써니', '드라마', '2011-05-04', '여성들의 우정과 회복을 그린 드라마.'),
('터널', '스릴러', '2016-08-10', '터널에 갇힌 사람의 생존을 다룬 스릴러.'),
('끝까지 간다', '스릴러', '2015-10-22', '범죄와 추격을 그린 스릴러.'),
('비공식작전', '액션', '2023-06-07', '비공식적으로 진행되는 작전을 다룬 액션 영화.'),
('친구', '드라마', '2001-11-09', '친구 사이의 갈등과 화해를 그린 드라마.'),
('탈출', '액션', '2020-11-25', '위험한 상황에서 탈출하는 이야기.'),
('밀양', '드라마', '2007-05-17', '상실과 치유를 다룬 드라마.'),
('버닝', '드라마', '2018-05-17', '청춘과 갈등을 그린 드라마.'),
('왕의 남자', '사극', '2005-12-29', '조선시대의 왕과 광대의 이야기를 그린 사극.'),
('국제시장', '드라마', '2014-12-17', '한국 현대사를 배경으로 한 가족 드라마.'),
('해운대', '재난', '2009-08-05', '해운대에서의 해일 재난을 다룬 영화.'),
('범죄도시', '액션', '2017-10-03', '범죄와 경찰의 충돌을 그린 액션 영화.'),
('돼지가 우물에 빠진 날', '드라마', '2011-01-20', '농촌을 배경으로 한 드라마.'),
('곤지암', '공포', '2018-03-28', '유령이 나오는 폐병원을 배경으로 한 공포 영화.'),
('피끓는 청춘', '드라마', '2014-05-08', '청춘의 갈등과 사랑을 그린 드라마.'),
('파묘', '공포', '2018-09-05', '무덤을 배경으로 한 공포 영화.'),
('탈주', '스릴러', '2020-07-03', '탈옥과 추적을 다룬 스릴러.'),
('노량: 죽음의 바다', '전쟁', '2021-12-22', '노량 해전의 후속 이야기.'),
('도굴', '코미디', '2020-11-05', '도굴과 범죄를 그린 코미디 영화.'),
('사냥의 시간', '스릴러', '2020-08-05', '사냥과 범죄를 다룬 스릴러.'),
('탐정 홍길동: 사라진 마을', '스릴러', '2010-01-28', '홍길동이 사라진 마을을 추적하는 이야기.'),
('엑시트', '코미디', '2019-07-31', '유쾌한 탈출극을 그린 코미디.'),
('뺑반', '액션', '2019-10-23', '고속도로에서의 추격전을 다룬 액션 영화.'),
('마약왕', '드라마', '2018-12-19', '마약 밀매와 범죄를 다룬 드라마.'),
('완벽한 타인', '코미디', '2018-11-01', '비밀과 거짓말을 주제로 한 코미디.'),
('형', '드라마', '2016-09-01', '형제간의 갈등과 화해를 그린 드라마.'),
('시간이탈자', 'SF', '2016-05-05', '시간을 넘나드는 여행을 그린 SF 영화.'),
('황야', '드라마', '2015-04-09', '황량한 환경에서의 생존과 갈등을 그린 드라마.'),
('압꾸정', '드라마', '2023-04-05', '압구정동을 배경으로 한 드라마.'),
('이터널스', 'SF', '2021-11-05', '영웅들의 이야기와 인류의 운명을 그린 SF 영화.'),
('백두산', '재난', '2019-12-19', '백두산 폭발과 재난을 다룬 영화.'),
('시동', '코미디', '2020-10-28', '자동차를 배경으로 한 코미디.'),
('페이스', '드라마', '2019-11-20', '인물들의 삶과 갈등을 다룬 드라마.'),
('거미집', '스릴러', '2024-02-14', '거미집을 배경으로 한 스릴러.'),
('마녀', '공포', '2018-10-31', '마녀의 복수와 공포를 그린 영화.'),
('안시성', '전쟁', '2018-09-19', '안시성을 방어하는 전투를 다룬 전쟁 영화.'),
('밤낚시', '공포', '2020-05-15', '밤에 일어나는 공포를 다룬 영화.'),
('댓글부대', '코미디', '2023-03-10', '댓글과 온라인을 배경으로 한 코미디 영화.'),
('헌트', '액션', '2022-07-08', '특수 요원의 액션을 다룬 영화.'),
('리볼버', '액션', '2023-05-12', '액션과 범죄를 다룬 영화.'),
('다만 악에서 구하소서', '액션', '2020-07-22', '악에서 구출을 다룬 액션 영화.'),
('사바하', '공포', '2019-02-20', '종교적 공포를 다룬 영화.'),
('신과함께: 인과연', '판타지', '2018-08-01', '사후 세계와 재판을 다룬 판타지 드라마.'),
('신과함께: 죄와벌', '판타지', '2017-08-02', '사후 세계의 재판과 갈등을 다룬 판타지.'),
('대립군', '전쟁', '2017-11-01', '조선시대의 전쟁을 다룬 영화.'),
('핸섬가이즈', '코미디', '2021-09-22', '코미디와 매력을 다룬 영화.'),
('보스', '액션', '2018-04-12', '보스와의 충돌을 다룬 액션 영화.'),
('한산: 용의 출현', '전쟁', '2022-08-10', '한산 해전과 전쟁을 다룬 영화.'),
('크로스', '액션', '2024-07-01', '범죄와 액션을 다룬 영화.'),
('길복순', '스릴러', '2024-06-07', '복수를 다룬 스릴러 영화.'),
('교섭', '드라마', '2023-12-20', '협상과 외교를 다룬 드라마.'),
('인질', '스릴러', '2021-08-04', '인질 상황을 다룬 스릴러.'),
('밀수', '드라마', '2024-03-20', '밀수와 관련된 이야기를 다룬 드라마.'),
('봉오동전투', '전쟁', '2019-08-07', '봉오동 전투를 다룬 전쟁 영화.'),
('치즈인터트랩', '드라마', '2024-04-17', '사람들의 관계를 그린 드라마.'),
('원더랜드', 'SF', '2023-09-01', '환상적인 세계를 그린 SF 영화.'),
('경관의 피', '스릴러', '2024-02-21', '경찰과 범죄를 다룬 스릴러 영화.'),
('사자', '공포', '2020-07-16', '악령과 공포를 다룬 영화.'),
('안녕하세요', '드라마', '2024-05-15', '인간 관계와 갈등을 다룬 드라마.'),
('자산어보', '드라마', '2021-02-24', '어부의 삶과 갈등을 다룬 드라마.'),
('말모이', '드라마', '2019-01-09', '조선어의 보존을 위한 노력과 이야기를 다룬 드라마.'),
('보안관', '액션', '2017-12-27', '지역 보안과 범죄를 다룬 액션 영화.'),
('장산범', '공포', '2021-09-09', '전설적인 괴물을 다룬 공포 영화.'),
('카트', '드라마', '2014-11-13', '임시직 여성들의 삶을 다룬 드라마.'),
('간첩', '스릴러', '2015-09-09', '간첩과의 전쟁을 다룬 스릴러.'),
('장화홍련', '공포', '2003-07-17', '한국 전통 공포를 다룬 영화.'),
('콘크리트 유토피아', '드라마', '2023-07-15', '재건과 생존을 다룬 드라마.'),
('드림', '드라마', '2023-05-01', '꿈과 목표를 다룬 드라마.'),
('청년경찰', '액션', '2017-08-09', '청년 경찰들의 액션과 범죄를 다룬 영화.'),
('악의 연대기', '스릴러', '2024-08-10', '악의 연대기를 다룬 스릴러.'),
('앵커', '드라마', '2024-01-17', '뉴스 앵커의 삶과 갈등을 다룬 드라마.'),
('선물', '드라마', '2024-02-07', '특별한 선물과 그로 인한 이야기를 다룬 드라마.'),
('나의 특별한 형제', '드라마', '2019-03-21', '형제의 특별한 관계를 다룬 드라마.'),
('악녀', '액션', '2017-06-08', '복수와 액션을 다룬 영화.'),
('하이재킹', '액션', '2024-09-05', '항공기 납치와 액션을 다룬 영화.'),
('리바운드', '드라마', '2024-08-23', '스포츠와 재기를 다룬 드라마.'),
('1987', '드라마', '2017-12-27', '1987년 민주화 운동을 다룬 드라마.'),
('의뢰인', '드라마', '2016-09-15', '법정 드라마와 의뢰인을 다룬 이야기.'),
('비상선언', '스릴러', '2022-09-08', '위기 상황에서의 비상 선언을 다룬 스릴러.'),
('남산의 부장들', '드라마', '2019-01-23', '남산에서의 정치적 갈등과 부장들의 이야기를 그린 드라마.'),
('그것만이 내 세상', '드라마', '2018-01-17', '한 가족의 갈등과 화해를 다룬 드라마.'),
('남한산성', '전쟁', '2017-11-01', '남한산성 전투를 배경으로 한 전쟁 드라마.'),
('마스터', '드라마', '2016-12-21', '조직과 권력의 이야기를 다룬 드라마.'),
('내부자들: 디 오리지널', '드라마', '2015-11-19', '정치적 음모와 내부자의 이야기를 다룬 드라마.'),
('내부자들', '드라마', '2015-11-19', '정치적 부패와 음모를 다룬 드라마.'),
('악마를 보았다', '스릴러', '2010-08-12', '복수와 악마를 다룬 스릴러.'),
('로기완', '드라마', '2024-01-10', '사람들의 삶과 갈등을 다룬 드라마.'),
('화란', '드라마', '2024-03-05', '사람들의 갈등과 이야기를 다룬 드라마.'),
('승리호', '드라마', '2024-07-12', '숭리호에서의 이야기와 갈등을 다룬 드라마.'),
('마음이', '드라마', '2023-10-04', '마음의 치유와 성장 이야기를 다룬 드라마.'),
('베테랑2', '액션', '2024-05-30', '베테랑 시리즈의 두 번째 이야기.'),
('역모: 반란의 시대', '전쟁', '2024-09-15', '역모와 반란을 다룬 전쟁 드라마.'),
('대회비', '드라마', '2024-06-10', '대회와 관련된 이야기.'),
('정직한 후보2', '코미디', '2024-07-20', '정직과 부정을 주제로 한 코미디 시퀄.'),
('보스턴 2024', '드라마', '2024-07-05', '보스턴과 관련된 이야기.'),
('소금꽃', '드라마', '2024-08-16', '소금꽃을 다룬 드라마.'),
('돌파', '액션', '2024-08-30', '위험한 상황을 돌파하는 액션 영화.'),
('소방관', '드라마', '2024-09-10', '소방관의 이야기와 갈등을 다룬 드라마.'),
('보이스', '스릴러', '2021-06-10', '인질 상황과 범죄를 다룬 스릴러.'),
('침입자', '스릴러', '2020-08-13', '가족의 집에 침입한 사람과의 갈등을 그린 스릴러.'),
('악인전', '스릴러', '2019-05-15', '악인을 쫓는 경찰과의 추격전을 다룬 스릴러.'),
('인랑', '액션', '2018-07-25', '미래 사회에서의 전투와 갈등을 그린 액션 영화.'),
('여평해전', '전쟁', '2015-07-15', '여평 해전의 전투를 다룬 전쟁 영화.'),
('기억의 밤', '스릴러', '2017-11-01', '기억을 둘러싼 미스터리를 그린 스릴러.'),
('최종병기 활', '액션', '2011-07-27', '조선시대의 활을 이용한 전투를 그린 액션 영화.'),
('상류사회', '드라마', '2018-06-20', '상류 사회의 갈등과 이야기를 다룬 드라마.'),
('표적', '액션', '2014-05-08', '표적을 추적하는 액션과 범죄를 다룬 영화.'),
('성난 황소', '액션', '2020-01-22', '가족을 잃고 복수에 나서는 남자의 이야기를 그린 액션.'),
('늑대사냥', '액션', '2022-09-07', '늑대와 같은 범죄자와의 전투를 다룬 액션 영화.'),
('노브레싱', '코미디', '2022-10-07', '스포츠와 코미디를 다룬 영화.'),
('천박사퇴마연구소', '공포', '2023-03-02', '퇴마와 공포를 다룬 연구소 배경의 영화.'),
('브로커', '드라마', '2022-06-08', '아기의 입양과 관련된 갈등을 그린 드라마.'),
('반도', '액션', '2020-07-15', '좀비 아포칼립스 후의 생존과 액션을 다룬 영화.'),
('골든슬럼버', '스릴러', '2018-01-31', '음모와 정치적 사건을 그린 스릴러 영화.'),
('검은 사제들', '공포', '2015-11-05', '사제와 악령의 대결을 그린 공포 영화.'),
('군도: 민란의 시대', '전쟁', '2014-07-23', '조선시대 민란을 다룬 전쟁 영화.'),
('초능력자', '액션', '2010-08-04', '초능력을 가진 범죄자를 추적하는 액션 영화.'),
('전우치', '판타지', '2009-12-23', '전설적인 도사를 다룬 판타지 액션 영화.'),
('인생은 아름다워', '드라마', '2017-12-14', '인생의 의미와 갈등을 다룬 드라마.'),
('육사오', '액션', '2021-11-11', '1960년대의 범죄와 액션을 그린 영화.'),
('블랙머니', '드라마', '2019-11-13', '금융 범죄와 스캔들을 다룬 드라마.'),
('퍼펙트맨', '코미디', '2020-10-14', '완벽한 남자의 코미디를 그린 영화.'),
('화이: 괴물을 삼킨 아이', '드라마', '2013-03-14', '괴물 같은 인생을 살아가는 아이의 이야기.'),
('파파로티', '드라마', '2013-10-10', '오페라의 꿈을 지닌 소년의 이야기를 그린 드라마.'),
('외계+인 1부', 'SF', '2022-12-22', '외계인과의 조우를 다룬 SF 영화.'),
('외계+인 2부', 'SF', '2023-12-15', '외계인과의 갈등을 이어가는 SF 시리즈의 두 번째 이야기.'),
('올뺴미', '드라마', '2024-03-29', '사회적 갈등과 이야기를 그린 드라마.'),
('리틀 포레스트', '드라마', '2018-02-28', '자연과 자아를 찾는 여정을 그린 드라마.'),
('나를 찾아줘', '드라마', '2018-07-11', '잃어버린 자아를 찾는 여정을 그린 드라마.'),
('친절한 금자씨', '스릴러', '2005-11-04', '복수와 복잡한 감정을 다룬 스릴러.'),
('비스트', '액션', '2020-08-27', '범죄와 액션을 다룬 영화.'),
('더 테러 라이브', '스릴러', '2013-08-08', '테러와 방송을 다룬 스릴러 영화.'),
('스마트폰을 떨어뜨렸을 뿐인데', '코미디', '2020-03-19', '스마트폰을 떨어뜨린 후의 소동을 그린 코미디.'),
('불한당: 나쁜 놈들의 세계', '액션', '2017-05-18', '범죄와 액션을 다룬 영화.'),
('오빠 생각', '드라마', '2020-01-15', '가족과의 갈등을 그린 드라마.'),
('기적', '드라마', '2021-09-15', '기적 같은 사건과 갈등을 그린 드라마.'),
('목격자', '스릴러', '2018-08-15', '목격자가 겪는 위기와 스릴을 그린 영화.'),
('대외비', '드라마', '2021-11-12', '정치와 비밀을 다룬 드라마.'),
('생일', '드라마', '2019-03-13', '가족과 생일을 중심으로 한 이야기.'),
('집으로 가는 길', '드라마', '2022-05-04', '집으로 돌아가는 여정을 다룬 드라마.'),
('카운트다운', '스릴러', '2019-09-10', '위험한 카운트다운과의 싸움을 그린 스릴러.'),
('너는 내 운명', '로맨스', '2022-11-23', '운명적인 사랑 이야기를 그린 로맨스.'),
('과속 스캔들', '코미디', '2008-12-03', '과속과 스캔들을 그린 코미디.'),
('미확인 동영상: 절대 클릭 금지', '공포', '2021-07-14', '미확인 동영상으로 인한 공포를 다룬 영화.'),
('동감', '로맨스', '2000-10-27', '시간을 초월한 사랑 이야기를 그린 로맨스.'),
('서부전선', '전쟁', '2024-05-15', '서부 전선의 전투를 다룬 전쟁 영화.'),
('연애담', '로맨스', '2022-02-15', '사랑과 연애의 다양한 이야기를 그린 로맨스.'),
('타짜: 원 아이드 잭', '액션', '2019-09-11', '타짜 시리즈의 새로운 이야기.'),
('82년생 김지영', '드라마', '2019-10-23', '한 여자의 삶과 시대를 다룬 드라마.'),
('용의자', '스릴러', '2013-09-05', '용의자의 추적과 미스터리를 그린 스릴러.'),
('도가니', '드라마', '2011-09-22', '학교 폭력과 정의를 다룬 드라마.'),
('굿바이 싱글', '로맨스', '2016-01-07', '결혼과 사랑을 다룬 로맨스 영화.'),
('차이나타운', '스릴러', '2015-06-10', '차이나타운을 배경으로 한 스릴러.'),
('바람피기 좋은 날', '로맨스', '2018-02-21', '사랑과 바람을 다룬 로맨스 영화.'),
('신세계', '스릴러', '2013-02-21', '범죄 조직의 이야기를 그린 스릴러.'),
('침묵', '스릴러', '2017-09-28', '침묵과 범죄를 다룬 스릴러.'),
('특별시민', '드라마', '2017-03-15', '정치와 사회적 이슈를 다룬 드라마.'),
('대호', '액션', '2015-07-30', '호랑이와의 전투를 그린 액션 영화.'),
('루시', '액션', '2014-08-20', '뇌의 잠재력을 활용한 액션 영화.'),
('꽃피는 봄이 오면', '드라마', '2023-05-10', '봄과 함께 피어나는 사랑을 그린 드라마.'),
('괴물', '드라마', '2006-07-27', '괴물과의 싸움과 가족의 이야기를 그린 드라마.'),
('시민덕희', '드라마', '2021-05-12', '시민과 사회의 문제를 다룬 드라마.'),
('공조2: 인터내셔널', '액션', '2022-09-07', '국제적인 범죄와의 싸움을 그린 액션 영화.'),
('창궐', '액션', '2018-10-25', '좀비와의 전투를 다룬 액션 영화.'),
('목요명화', '스릴러', '2024-09-12', '자바와의 전투를 다룬 스릴러 영화.');



-- 영화와 감독간의 관계 설정 --
CREATE TABLE MovieDirector (
  m_id INT NOT NULL,
  d_id INT NOT NULL,
  PRIMARY KEY (m_id, d_id),
  FOREIGN KEY (m_id) REFERENCES Movie(m_id),
  FOREIGN KEY (d_id) REFERENCES Director(d_id)
);

-- 영화-감독 관계 삽입 예시 --
-- 예를 들어, 영화 1번과 감독 1번을 연결하는 경우
INSERT INTO MovieDirector (m_id, d_id) VALUES (1, 1);
INSERT INTO MovieDirector (m_id, d_id) VALUES (2, 1);
INSERT INTO MovieDirector (m_id, d_id) VALUES (3, 1);
INSERT INTO MovieDirector (m_id, d_id) VALUES (4, 2);
INSERT INTO MovieDirector (m_id, d_id) VALUES (5, 2);
INSERT INTO MovieDirector (m_id, d_id) VALUES (6, 2);
INSERT INTO MovieDirector (m_id, d_id) VALUES (7, 3);
INSERT INTO MovieDirector (m_id, d_id) VALUES (8, 3);
INSERT INTO MovieDirector (m_id, d_id) VALUES (9, 3);
INSERT INTO MovieDirector (m_id, d_id) VALUES (10, 4);
INSERT INTO MovieDirector (m_id, d_id) VALUES (11, 4);
INSERT INTO MovieDirector (m_id, d_id) VALUES (12, 4);
INSERT INTO MovieDirector (m_id, d_id) VALUES (13, 5);
INSERT INTO MovieDirector (m_id, d_id) VALUES (14, 5);
INSERT INTO MovieDirector (m_id, d_id) VALUES (15, 5);
INSERT INTO MovieDirector (m_id, d_id) VALUES (16, 6);
INSERT INTO MovieDirector (m_id, d_id) VALUES (17, 6);
INSERT INTO MovieDirector (m_id, d_id) VALUES (18, 6);
INSERT INTO MovieDirector (m_id, d_id) VALUES (19, 7);
INSERT INTO MovieDirector (m_id, d_id) VALUES (20, 7);
INSERT INTO MovieDirector (m_id, d_id) VALUES (21, 8);
INSERT INTO MovieDirector (m_id, d_id) VALUES (22, 8);
INSERT INTO MovieDirector (m_id, d_id) VALUES (23, 8);
INSERT INTO MovieDirector (m_id, d_id) VALUES (24, 9);
INSERT INTO MovieDirector (m_id, d_id) VALUES (25, 9);
INSERT INTO MovieDirector (m_id, d_id) VALUES (26, 9);
INSERT INTO MovieDirector (m_id, d_id) VALUES (27, 10);
INSERT INTO MovieDirector (m_id, d_id) VALUES (28, 10);
INSERT INTO MovieDirector (m_id, d_id) VALUES (29, 10);
INSERT INTO MovieDirector (m_id, d_id) VALUES (30, 11);
INSERT INTO MovieDirector (m_id, d_id) VALUES (31, 11);
INSERT INTO MovieDirector (m_id, d_id) VALUES (32, 11);
INSERT INTO MovieDirector (m_id, d_id) VALUES (33, 12);
INSERT INTO MovieDirector (m_id, d_id) VALUES (34, 12);
INSERT INTO MovieDirector (m_id, d_id) VALUES (35, 12);
INSERT INTO MovieDirector (m_id, d_id) VALUES (36, 13);
INSERT INTO MovieDirector (m_id, d_id) VALUES (37, 13);
INSERT INTO MovieDirector (m_id, d_id) VALUES (38, 14);
INSERT INTO MovieDirector (m_id, d_id) VALUES (39, 14);
INSERT INTO MovieDirector (m_id, d_id) VALUES (40, 14);
INSERT INTO MovieDirector (m_id, d_id) VALUES (41, 15);
INSERT INTO MovieDirector (m_id, d_id) VALUES (42, 15);
INSERT INTO MovieDirector (m_id, d_id) VALUES (43, 15);
INSERT INTO MovieDirector (m_id, d_id) VALUES (44, 16);
INSERT INTO MovieDirector (m_id, d_id) VALUES (45, 17);
INSERT INTO MovieDirector (m_id, d_id) VALUES (46, 17);
INSERT INTO MovieDirector (m_id, d_id) VALUES (47, 18);
INSERT INTO MovieDirector (m_id, d_id) VALUES (48, 18);
INSERT INTO MovieDirector (m_id, d_id) VALUES (49, 18);
INSERT INTO MovieDirector (m_id, d_id) VALUES (50, 19);
INSERT INTO MovieDirector (m_id, d_id) VALUES (51, 20);
INSERT INTO MovieDirector (m_id, d_id) VALUES (52, 20);
INSERT INTO MovieDirector (m_id, d_id) VALUES (53, 20);
INSERT INTO MovieDirector (m_id, d_id) VALUES (54, 21);
INSERT INTO MovieDirector (m_id, d_id) VALUES (55, 21);
INSERT INTO MovieDirector (m_id, d_id) VALUES (56, 22);
INSERT INTO MovieDirector (m_id, d_id) VALUES (57, 23);
INSERT INTO MovieDirector (m_id, d_id) VALUES (58, 23);
INSERT INTO MovieDirector (m_id, d_id) VALUES (59, 24);
INSERT INTO MovieDirector (m_id, d_id) VALUES (60, 24);
INSERT INTO MovieDirector (m_id, d_id) VALUES (61, 25);
INSERT INTO MovieDirector (m_id, d_id) VALUES (62, 26);
INSERT INTO MovieDirector (m_id, d_id) VALUES (63, 27);
INSERT INTO MovieDirector (m_id, d_id) VALUES (64, 27);
INSERT INTO MovieDirector (m_id, d_id) VALUES (65, 27);
INSERT INTO MovieDirector (m_id, d_id) VALUES (66, 28);
INSERT INTO MovieDirector (m_id, d_id) VALUES (67, 28);
INSERT INTO MovieDirector (m_id, d_id) VALUES (68, 28);
INSERT INTO MovieDirector (m_id, d_id) VALUES (69, 29);
INSERT INTO MovieDirector (m_id, d_id) VALUES (70, 30);
INSERT INTO MovieDirector (m_id, d_id) VALUES (71, 30);
INSERT INTO MovieDirector (m_id, d_id) VALUES (72, 30);
INSERT INTO MovieDirector (m_id, d_id) VALUES (73, 31);
INSERT INTO MovieDirector (m_id, d_id) VALUES (74, 32);
INSERT INTO MovieDirector (m_id, d_id) VALUES (75, 33);
INSERT INTO MovieDirector (m_id, d_id) VALUES (76, 33);
INSERT INTO MovieDirector (m_id, d_id) VALUES (77, 34);
INSERT INTO MovieDirector (m_id, d_id) VALUES (78, 34);
INSERT INTO MovieDirector (m_id, d_id) VALUES (79, 35);
INSERT INTO MovieDirector (m_id, d_id) VALUES (80, 36);
INSERT INTO MovieDirector (m_id, d_id) VALUES (81, 37);
INSERT INTO MovieDirector (m_id, d_id) VALUES (82, 38);
INSERT INTO MovieDirector (m_id, d_id) VALUES (83, 39);
INSERT INTO MovieDirector (m_id, d_id) VALUES (84, 40);
INSERT INTO MovieDirector (m_id, d_id) VALUES (85, 40);
INSERT INTO MovieDirector (m_id, d_id) VALUES (86, 40);
INSERT INTO MovieDirector (m_id, d_id) VALUES (87, 41);
INSERT INTO MovieDirector (m_id, d_id) VALUES (88, 42);
INSERT INTO MovieDirector (m_id, d_id) VALUES (89, 43);
INSERT INTO MovieDirector (m_id, d_id) VALUES (90, 43);
INSERT INTO MovieDirector (m_id, d_id) VALUES (91, 44);
INSERT INTO MovieDirector (m_id, d_id) VALUES (92, 45);
INSERT INTO MovieDirector (m_id, d_id) VALUES (93, 45);
INSERT INTO MovieDirector (m_id, d_id) VALUES (94, 46);
INSERT INTO MovieDirector (m_id, d_id) VALUES (95, 47);
INSERT INTO MovieDirector (m_id, d_id) VALUES (96, 48);
INSERT INTO MovieDirector (m_id, d_id) VALUES (97, 49);
INSERT INTO MovieDirector (m_id, d_id) VALUES (98, 50);
INSERT INTO MovieDirector (m_id, d_id) VALUES (247, 51);


-- 영화와 배우간의 관계 설정 --
CREATE TABLE MovieActor (
  m_id INT NOT NULL,
  a_id INT NOT NULL,
  PRIMARY KEY (m_id, a_id),
  FOREIGN KEY (m_id) REFERENCES Movie(m_id),
  FOREIGN KEY (a_id) REFERENCES Actor(a_id)
);


-- 영화-배우 관계 삽입 예시 --
-- 예를 들어, 영화 1번과 배우 1번을 연결하는 경우

INSERT INTO MovieActor (m_id, a_id) VALUES (1, 1); -- 영화: 아가씨, 출연 배우: 김민희, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (1, 2); -- 영화: 아가씨, 출연 배우: 김민희, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (2, 3); -- 영화: 박쥐, 출연 배우: 송강호, 김옥빈
INSERT INTO MovieActor (m_id, a_id) VALUES (2, 4); -- 영화: 박쥐, 출연 배우: 송강호, 김옥빈
INSERT INTO MovieActor (m_id, a_id) VALUES (3, 5); -- 영화: 올드보이, 출연 배우: 최민식, 유지태
INSERT INTO MovieActor (m_id, a_id) VALUES (3, 6); -- 영화: 올드보이, 출연 배우: 최민식, 유지태
INSERT INTO MovieActor (m_id, a_id) VALUES (4, 7); -- 영화: 곡성, 출연 배우: 황정민, 곽도원
INSERT INTO MovieActor (m_id, a_id) VALUES (4, 8); -- 영화: 곡성, 출연 배우: 황정민, 곽도원
INSERT INTO MovieActor (m_id, a_id) VALUES (5, 2); -- 영화: 황해, 출연 배우: 하정우, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (5, 9); -- 영화: 황해, 출연 배우: 하정우, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (6, 9); -- 영화: 추격자, 출연 배우: 김윤석, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (6, 2); -- 영화: 추격자, 출연 배우: 김윤석, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (7, 11); -- 영화: 암살, 출연 배우: 전지현, 이정재
INSERT INTO MovieActor (m_id, a_id) VALUES (7, 52); -- 영화: 암살, 출연 배우: 전지현, 이정재
INSERT INTO MovieActor (m_id, a_id) VALUES (8, 11); -- 영화: 도둑들, 출연 배우: 김수현, 전지현
INSERT INTO MovieActor (m_id, a_id) VALUES (8, 10); -- 영화: 도둑들, 출연 배우: 김수현, 전지현
INSERT INTO MovieActor (m_id, a_id) VALUES (9, 12); -- 영화: 타짜, 출연 배우: 조승우, 김혜수
INSERT INTO MovieActor (m_id, a_id) VALUES (9, 13); -- 영화: 타짜, 출연 배우: 조승우, 김혜수
INSERT INTO MovieActor (m_id, a_id) VALUES (10, 14); -- 영화: 군함도, 출연 배우: 소지섭, 송중기
INSERT INTO MovieActor (m_id, a_id) VALUES (10, 15); -- 영화: 군함도, 출연 배우: 소지섭, 송중기
INSERT INTO MovieActor (m_id, a_id) VALUES (11, 7); -- 영화: 베테랑, 출연 배우: 황정민, 유아인
INSERT INTO MovieActor (m_id, a_id) VALUES (11, 16); -- 영화: 베테랑, 출연 배우: 황정민, 유아인
INSERT INTO MovieActor (m_id, a_id) VALUES (12, 53); -- 영화: 부당거래, 출연 배우: 류승완, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (12, 54); -- 영화: 부당거래, 출연 배우: 류승완, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (13, 19); -- 영화: 태극기 휘날리며, 출연 배우: 장동건, 원빈
INSERT INTO MovieActor (m_id, a_id) VALUES (13, 20); -- 영화: 태극기 휘날리며, 출연 배우: 장동건, 원빈
INSERT INTO MovieActor (m_id, a_id) VALUES (14, 21); -- 영화: 쉬리, 출연 배우: 한석규, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (14, 22); -- 영화: 쉬리, 출연 배우: 한석규, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (15, 19); -- 영화: 마이웨이, 출연 배우: 장동건, 오다기리 조
INSERT INTO MovieActor (m_id, a_id) VALUES (15, 23); -- 영화: 마이웨이, 출연 배우: 장동건, 오다기리 조
INSERT INTO MovieActor (m_id, a_id) VALUES (16, 3); -- 영화: 밀정, 출연 배우: 송강호, 공유
INSERT INTO MovieActor (m_id, a_id) VALUES (16, 55); -- 영화: 밀정, 출연 배우: 송강호, 공유
INSERT INTO MovieActor (m_id, a_id) VALUES (17, 3); -- 영화: 좋은놈 나쁜놈 이상한놈, 출연 배우: 송강호, 이병헌
INSERT INTO MovieActor (m_id, a_id) VALUES (17, 47); -- 영화: 좋은놈 나쁜놈 이상한놈, 출연 배우: 송강호, 이병헌
INSERT INTO MovieActor (m_id, a_id) VALUES (18, 17); -- 영화: 반칙왕, 출연 배우: 류승룡, 이광수
INSERT INTO MovieActor (m_id, a_id) VALUES (18, 18); -- 영화: 반칙왕, 출연 배우: 류승룡, 이광수
INSERT INTO MovieActor (m_id, a_id) VALUES (19, 56); -- 영화: 강철비 시리즈, 출연 배우: 정우성, 강동원
INSERT INTO MovieActor (m_id, a_id) VALUES (19, 57); -- 영화: 강철비 시리즈, 출연 배우: 정우성, 강동원
INSERT INTO MovieActor (m_id, a_id) VALUES (20, 3); -- 영화: 변호인, 출연 배우: 송강호, 김향기
INSERT INTO MovieActor (m_id, a_id) VALUES (20, 58); -- 영화: 변호인, 출연 배우: 송강호, 김향기
INSERT INTO MovieActor (m_id, a_id) VALUES (21, 54); -- 영화: 공작, 출연 배우: 이성민, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (21, 59); -- 영화: 공작, 출연 배우: 이성민, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (22, 2); -- 영화: 범죄와의 전쟁, 출연 배우: 최민식, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (22, 5); -- 영화: 범죄와의 전쟁, 출연 배우: 최민식, 하정우
INSERT INTO MovieActor (m_id, a_id) VALUES (23, 54); -- 영화: 용서받지 못한자, 출연 배우: 김윤석, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (23, 9); -- 영화: 용서받지 못한자, 출연 배우: 김윤석, 조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (24, 17); -- 영화: 극한 직업, 출연 배우: 류승룡, 이하늬
INSERT INTO MovieActor (m_id, a_id) VALUES (24, 60); -- 영화: 극한 직업, 출연 배우: 류승룡, 이하늬
INSERT INTO MovieActor (m_id, a_id) VALUES (25, 13); -- 영화: 바람 바람 바람, 출연 배우: 김혜수, 김상중
INSERT INTO MovieActor (m_id, a_id) VALUES (25, 39); -- 영화: 바람 바람 바람, 출연 배우: 김혜수, 김상중
INSERT INTO MovieActor (m_id, a_id) VALUES (26, 40); -- 영화: 스물, 출연 배우: 김우빈, 이종석
INSERT INTO MovieActor (m_id, a_id) VALUES (26, 61); -- 영화: 스물, 출연 배우: 김우빈, 이종석
INSERT INTO MovieActor (m_id, a_id) VALUES (27, 2); -- 영화: 신과함께 시리즈, 출연 배우: 하정우, 차태현
INSERT INTO MovieActor (m_id, a_id) VALUES (27, 62); -- 영화: 신과함께 시리즈, 출연 배우: 하정우, 차태현
INSERT INTO MovieActor (m_id, a_id) VALUES (28, 24); -- 영화: 미스터고, 출연 배우: 장혁, 심은경
INSERT INTO MovieActor (m_id, a_id) VALUES (28, 25); -- 영화: 미스터고, 출연 배우: 장혁, 심은경
INSERT INTO MovieActor (m_id, a_id) VALUES (29, 26); -- 영화: 국가대표, 출연 배우: 현빈, 강지환
INSERT INTO MovieActor (m_id, a_id) VALUES (29, 27); -- 영화: 국가대표, 출연 배우: 현빈, 강지환
INSERT INTO MovieActor (m_id, a_id) VALUES (30, 3); -- 영화: 기생충, 출연 배우: 송강호, 박소담
INSERT INTO MovieActor (m_id, a_id) VALUES (30, 28); -- 영화: 기생충, 출연 배우: 송강호, 박소담
INSERT INTO MovieActor (m_id, a_id) VALUES (31, 3); -- 영화: 설국열차, 출연 배우: 크리스 에반스, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (31, 29); -- 영화: 설국열차, 출연 배우: 크리스 에반스, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (32, 9); -- 영화: 해무, 출연 배우: 김윤석, 박해일
INSERT INTO MovieActor (m_id, a_id) VALUES (32, 30); -- 영화: 해무, 출연 배우: 김윤석, 박해일
INSERT INTO MovieActor (m_id, a_id) VALUES (33, 31); -- 영화: 이끼, 출연 배우: 정재영, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (33, 22); -- 영화: 이끼, 출연 배우: 정재영, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (34, 33); -- 영화: 주유소 습격사건2, 출연 배우: 김래원, 박신혜
INSERT INTO MovieActor (m_id, a_id) VALUES (34, 63); -- 영화: 주유소 습격사건2, 출연 배우: 김래원, 박신혜
INSERT INTO MovieActor (m_id, a_id) VALUES (35, 64); -- 영화: 깡철이, 출연 배우: 강성진, 김민희
INSERT INTO MovieActor (m_id, a_id) VALUES (35, 1); -- 영화: 깡철이, 출연 배우: 강성진, 김민희
INSERT INTO MovieActor (m_id, a_id) VALUES (36, 17); -- 영화: 집으로, 출연 배우: 류승룡, 김예원
INSERT INTO MovieActor (m_id, a_id) VALUES (36, 32); -- 영화: 집으로, 출연 배우: 류승룡, 김예원
INSERT INTO MovieActor (m_id, a_id) VALUES (37, 33); -- 영화: 오늘, 출연 배우: 박신혜, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (37, 9); -- 영화: 오늘, 출연 배우: 박신혜, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (38, 52); -- 영화: 우리는 형제입니다, 출연 배우: 이정재, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (38, 65); -- 영화: 우리는 형제입니다, 출연 배우: 이정재, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (39, 13); -- 영화: 하이힐, 출연 배우: 김혜수, 정재영
INSERT INTO MovieActor (m_id, a_id) VALUES (39, 31); -- 영화: 하이힐, 출연 배우: 김혜수, 정재영
INSERT INTO MovieActor (m_id, a_id) VALUES (40, 9); -- 영화: 바라던 바다, 출연 배우: 김윤석, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (40, 65); -- 영화: 바라던 바다, 출연 배우: 김윤석, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (41, 3); -- 영화: 택시운전사, 출연 배우: 송강호, 유해진
INSERT INTO MovieActor (m_id, a_id) VALUES (41, 66); -- 영화: 택시운전사, 출연 배우: 송강호, 유해진
INSERT INTO MovieActor (m_id, a_id) VALUES (42, 3); -- 영화: 의형제, 출연 배우: 정우성, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (42, 56); -- 영화: 의형제, 출연 배우: 정우성, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (43, 56); -- 영화: 고지전, 출연 배우: 하정우, 이정재
INSERT INTO MovieActor (m_id, a_id) VALUES (44, 47); -- 영화: 알포인트, 출연 배우: 이병헌, 조재현
INSERT INTO MovieActor (m_id, a_id) VALUES (44, 67); -- 영화: 알포인트, 출연 배우: 이병헌, 조재현
INSERT INTO MovieActor (m_id, a_id) VALUES (45, 68); -- 영화: 조선마술사, 출연 배우: 김명민, 고수
INSERT INTO MovieActor (m_id, a_id) VALUES (45, 69); -- 영화: 조선마술사, 출연 배우: 김명민, 고수
INSERT INTO MovieActor (m_id, a_id) VALUES (46, 9); -- 영화: 혈의 누, 출연 배우: 김소연, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (46, 70); -- 영화: 혈의 누, 출연 배우: 김소연, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (47, 50); -- 영화: 서울의 봄, 출연 배우: 신하균, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (47, 9); -- 영화: 서울의 봄, 출연 배우: 신하균, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (48, 56); -- 영화: 아수라, 출연 배우: 정우성, 황정민
INSERT INTO MovieActor (m_id, a_id) VALUES (48, 7); -- 영화: 아수라, 출연 배우: 정우성, 황정민
INSERT INTO MovieActor (m_id, a_id) VALUES (49, 54); -- 영화: 감기, 출연 배우: 조진웅, 김무열
INSERT INTO MovieActor (m_id, a_id) VALUES (49, 71); -- 영화: 감기, 출연 배우: 조진웅, 김무열
INSERT INTO MovieActor (m_id, a_id) VALUES (50, 9); -- 영화: 암수살인, 출연 배우: 김윤석, 주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (50, 38); -- 영화: 암수살인, 출연 배우: 김윤석, 주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (51, 15); -- 영화: 늑대소년, 출연 배우: 송중기, 박보영
INSERT INTO MovieActor (m_id, a_id) VALUES (51, 72); -- 영화: 늑대소년, 출연 배우: 송중기, 박보영
INSERT INTO MovieActor (m_id, a_id) VALUES (52, 73); -- 영화: 탐정 홍길동, 출연 배우: 김명민, 오정세
INSERT INTO MovieActor (m_id, a_id) VALUES (52, 69); -- 영화: 탐정 홍길동, 출연 배우: 김명민, 오정세
INSERT INTO MovieActor (m_id, a_id) VALUES (53, 15); -- 영화: 승리호, 출연 배우: 송중기, 김태리
INSERT INTO MovieActor (m_id, a_id) VALUES (53, 74); -- 영화: 승리호, 출연 배우: 송중기, 김태리
INSERT INTO MovieActor (m_id, a_id) VALUES (54, 75); -- 영화: 뷰티 인사이드, 출연 배우: 한효주, 박서준
INSERT INTO MovieActor (m_id, a_id) VALUES (54, 76); -- 영화: 뷰티 인사이드, 출연 배우: 한효주, 박서준
INSERT INTO MovieActor (m_id, a_id) VALUES (55, 54); -- 영화: 독전2, 출연 배우: 조진웅, 김주혁
INSERT INTO MovieActor (m_id, a_id) VALUES (55, 78); -- 영화: 독전2, 출연 배우: 조진웅, 김주혁
INSERT INTO MovieActor (m_id, a_id) VALUES (56, 77); -- 영화: 웰컴투동막골, 출연 배우: 차승원, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (56, 75); -- 영화: 웰컴투동막골, 출연 배우: 차승원, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (57, 56); -- 영화: 우리들의 행복한 시간, 출연 배우: 정우성, 이영애
INSERT INTO MovieActor (m_id, a_id) VALUES (57, 79); -- 영화: 우리들의 행복한 시간, 출연 배우: 정우성, 이영애
INSERT INTO MovieActor (m_id, a_id) VALUES (58, 9); -- 영화: 고령화 가족, 출연 배우: 김윤석, 김혜수
INSERT INTO MovieActor (m_id, a_id) VALUES (58, 13); -- 영화: 고령화 가족, 출연 배우: 김윤석, 김혜수
INSERT INTO MovieActor (m_id, a_id) VALUES (59, 13); -- 영화: 나의 사랑 나의 신부, 출연 배우: 김혜수, 이병헌
INSERT INTO MovieActor (m_id, a_id) VALUES (59, 47); -- 영화: 나의 사랑 나의 신부, 출연 배우: 김혜수, 이병헌
INSERT INTO MovieActor (m_id, a_id) VALUES (60, 39); -- 영화: 빅토리, 출연 배우: 김상중, 장동건
INSERT INTO MovieActor (m_id, a_id) VALUES (60, 19); -- 영화: 빅토리, 출연 배우: 김상중, 장동건
INSERT INTO MovieActor (m_id, a_id) VALUES (61, 65); -- 영화: 파일럿, 출연 배우: 조정석, 이주명
INSERT INTO MovieActor (m_id, a_id) VALUES (61, 80); -- 영화: 파일럿, 출연 배우: 조정석, 이주명
INSERT INTO MovieActor (m_id, a_id) VALUES (62, 63); -- 영화: 가장 보통의 연애, 출연 배우: 김래원, 공효진
INSERT INTO MovieActor (m_id, a_id) VALUES (62, 43); -- 영화: 가장 보통의 연애, 출연 배우: 김래원, 공효진
INSERT INTO MovieActor (m_id, a_id) VALUES (63, 3); -- 영화: 하울링, 출연 배우: 송강호, 김혜수
INSERT INTO MovieActor (m_id, a_id) VALUES (64, 13); -- 영화: 쌍화점, 출연 배우: 김혜수, 정우성
INSERT INTO MovieActor (m_id, a_id) VALUES (65, 12); -- 영화: 말죽거리 잔혹사, 출연 배우: 조승우, 김래원
INSERT INTO MovieActor (m_id, a_id) VALUES (65, 63); -- 영화: 말죽거리 잔혹사, 출연 배우: 조승우, 김래원
INSERT INTO MovieActor (m_id, a_id) VALUES (66, 15); -- 영화: 당신이 잠든 사이, 출연 배우: 송중기, 박보영
INSERT INTO MovieActor (m_id, a_id) VALUES (66, 72); -- 영화: 당신이 잠든 사이, 출연 배우: 송중기, 박보영
INSERT INTO MovieActor (m_id, a_id) VALUES (67, 44); -- 영화: 황진이, 출연 배우: 한지민, 유승호
INSERT INTO MovieActor (m_id, a_id) VALUES (67, 81); -- 영화: 황진이, 출연 배우: 한지민, 유승호
INSERT INTO MovieActor (m_id, a_id) VALUES (68, 82); -- 영화: 라디오스타, 출연 배우: 박중훈,안성기
INSERT INTO MovieActor (m_id, a_id) VALUES (69, 83); -- 영화: 내 심장을 쏴라, 출연 배우: 이병헌, 송중기
INSERT INTO MovieActor (m_id, a_id) VALUES (70, 84); -- 영화: 연애의 온도, 출연 배우: 이민기, 김민희
INSERT INTO MovieActor (m_id, a_id) VALUES (70, 1); -- 영화: 연애의 온도, 출연 배우: 이민기, 김민희
INSERT INTO MovieActor (m_id, a_id) VALUES (71, 12); -- 영화: 지구를 지켜라, 출연 배우: 조승우, 박신혜
INSERT INTO MovieActor (m_id, a_id) VALUES (71, 33); -- 영화: 지구를 지켜라, 출연 배우: 조승우, 박신혜
INSERT INTO MovieActor (m_id, a_id) VALUES (72, 46); -- 영화: 특종, 출연 배우: 마동석, 이정재
INSERT INTO MovieActor (m_id, a_id) VALUES (72, 52); -- 영화: 특종, 출연 배우: 마동석, 이정재
INSERT INTO MovieActor (m_id, a_id) VALUES (73, 30); -- 영화: 은교, 출연 배우: 박해일, 김고은
INSERT INTO MovieActor (m_id, a_id) VALUES (73, 34); -- 영화: 은교, 출연 배우: 박해일, 김고은
INSERT INTO MovieActor (m_id, a_id) VALUES (74, 17); -- 영화: 7번방의 선물, 출연 배우: 류승룡, 갈소원
INSERT INTO MovieActor (m_id, a_id) VALUES (74, 35); -- 영화: 7번방의 선물, 출연 배우: 류승룡, 갈소원
INSERT INTO MovieActor (m_id, a_id) VALUES (75, 17); -- 영화: 명량, 출연 배우: 최민식, 류승룡
INSERT INTO MovieActor (m_id, a_id) VALUES (75, 5); -- 영화: 명량, 출연 배우: 최민식, 류승룡
INSERT INTO MovieActor (m_id, a_id) VALUES (76, 36); -- 영화: 노량, 출연 배우: 설경구, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (76, 9); -- 영화: 노량, 출연 배우: 설경구, 김윤석
INSERT INTO MovieActor (m_id, a_id) VALUES (77, 47); -- 영화: 광해, 출연 배우: 이병헌, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (77, 75); -- 영화: 광해, 출연 배우: 이병헌, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (78, 52); -- 영화: 행복의 나라, 출연 배우: 이정재, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (78, 65); -- 영화: 행복의 나라, 출연 배우: 이정재, 조정석
INSERT INTO MovieActor (m_id, a_id) VALUES (79, 55); -- 영화: 부산행, 출연 배우: 공유, 정유미
INSERT INTO MovieActor (m_id, a_id) VALUES (79, 37); -- 영화: 부산행, 출연 배우: 공유, 정유미
INSERT INTO MovieActor (m_id, a_id) VALUES (80, 57); -- 영화: 검사외전, 출연 배우: 강동원, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (80, 75); -- 영화: 검사외전, 출연 배우: 강동원, 한효주
INSERT INTO MovieActor (m_id, a_id) VALUES (81, 3); -- 영화: 관상, 출연 배우: 이정재, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (81, 52); -- 영화: 관상, 출연 배우: 이정재, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (82, 25); -- 영화: 수상한 그녀, 출연 배우: 심은경, 나문희
INSERT INTO MovieActor (m_id, a_id) VALUES (82, 85); -- 영화: 수상한 그녀, 출연 배우: 심은경, 나문희
INSERT INTO MovieActor (m_id, a_id) VALUES (83, 25); -- 영화: 써니, 출연 배우: 유호정, 심은경
INSERT INTO MovieActor (m_id, a_id) VALUES (83, 86); -- 영화: 써니, 출연 배우: 유호정, 심은경
INSERT INTO MovieActor (m_id, a_id) VALUES (84, 2); -- 영화: 터널, 출연 배우: 하정우, 배두나
INSERT INTO MovieActor (m_id, a_id) VALUES (84, 87); -- 영화: 터널, 출연 배우: 하정우, 배두나
INSERT INTO MovieActor (m_id, a_id) VALUES (85, 88); -- 영화: 끝까지 간다, 출연 배우: 이선균,조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (85, 54); -- 영화: 끝까지 간다, 출연 배우: 이선균,조진웅
INSERT INTO MovieActor (m_id, a_id) VALUES (85, 2); -- 영화: 비공식작전, 출연 배우: 하정우,주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (85, 38); -- 영화: 비공식작전, 출연 배우: 하정우,주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (87, 19); -- 영화: 친구, 출연 배우: 장동건, 유오성
INSERT INTO MovieActor (m_id, a_id) VALUES (87, 89); -- 영화: 친구, 출연 배우: 장동건, 유오성
INSERT INTO MovieActor (m_id, a_id) VALUES (88, 88); -- 영화: 탈출, 출연 배우: 이선균, 주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (88, 38); -- 영화: 탈출, 출연 배우: 이선균, 주지훈
INSERT INTO MovieActor (m_id, a_id) VALUES (89, 3); -- 영화: 밀양, 출연 배우: 전도연, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (89, 90); -- 영화: 밀양, 출연 배우: 전도연, 송강호
INSERT INTO MovieActor (m_id, a_id) VALUES (90, 16); -- 영화: 버닝, 출연 배우: 유아인, 전도연
INSERT INTO MovieActor (m_id, a_id) VALUES (90, 90); -- 영화: 버닝, 출연 배우: 유아인, 전도연
INSERT INTO MovieActor (m_id, a_id) VALUES (91, 31); -- 영화: 왕의 남자, 출연 배우: 정재영, 이준기
INSERT INTO MovieActor (m_id, a_id) VALUES (91, 91); -- 영화: 왕의 남자, 출연 배우: 정재영, 이준기
INSERT INTO MovieActor (m_id, a_id) VALUES (92, 7); -- 영화: 국제시장, 출연 배우: 황정민, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (92, 22); -- 영화: 국제시장, 출연 배우: 황정민, 김윤진
INSERT INTO MovieActor (m_id, a_id) VALUES (93, 36); -- 영화: 해운대, 출연 배우: 설경구, 하지원
INSERT INTO MovieActor (m_id, a_id) VALUES (93, 92); -- 영화: 해운대, 출연 배우: 설경구, 하지원
INSERT INTO MovieActor (m_id, a_id) VALUES (94, 46); -- 영화: 범죄도시, 출연 배우: 마동석, 윤계상
INSERT INTO MovieActor (m_id, a_id) VALUES (94, 93); -- 영화: 범죄도시, 출연 배우: 마동석, 윤계상
INSERT INTO MovieActor (m_id, a_id) VALUES (95, 94); -- 영화: 돼지가 우물에 빠진 날, 출연 배우: 김의성, 박진성
INSERT INTO MovieActor (m_id, a_id) VALUES (95, 95); -- 영화: 돼지가 우물에 빠진 날, 출연 배우: 김의성, 박진성
INSERT INTO MovieActor (m_id, a_id) VALUES (96, 96); -- 영화: 곤지암, 출연 배우: 위하준, 박지현
INSERT INTO MovieActor (m_id, a_id) VALUES (96, 97); -- 영화: 곤지암, 출연 배우: 위하준, 박지현
INSERT INTO MovieActor (m_id, a_id) VALUES (97, 72); -- 영화: 피끓는 청춘, 출연 배우: 박보영, 이종석
INSERT INTO MovieActor (m_id, a_id) VALUES (97, 40); -- 영화: 피끓는 청춘, 출연 배우: 박보영, 이종석
INSERT INTO MovieActor (m_id, a_id) VALUES (98, 5); -- 영화: 파묘, 출연 배우: 최민식, 김고은
INSERT INTO MovieActor (m_id, a_id) VALUES (98, 34); -- 영화: 파묘, 출연 배우: 최민식, 김고은
INSERT INTO MovieActor (m_id, a_id) VALUES (247, 98); -- 영화: 목요명화, 출연 배우: 탁태호




-- 감독 이름으로 연출한 영화 조회--
SELECT d.d_name AS 감독, m.m_name AS 영화제목, m.o_date AS 개봉일, m.outline AS 개요
FROM Movie m
JOIN MovieDirector md ON m.m_id = md.m_id
JOIN Director d ON md.d_id = d.d_id
WHERE d.d_name = '박찬욱';

-- 감독 이름으로 연출한 영화 및 출연배우 조회--
SELECT d.d_name AS 감독, 
       m.m_name AS 영화제목, 
       m.o_date AS 개봉일, 
       m.outline AS 개요,
       a.a_name AS 배우
FROM Director d
JOIN MovieDirector md ON d.d_id = md.d_id
JOIN Movie m ON md.m_id = m.m_id
LEFT JOIN MovieActor ma ON m.m_id = ma.m_id
LEFT JOIN Actor a ON ma.a_id = a.a_id
WHERE d.d_name = '박찬욱'; 

-- 영화 제목으로 감독 및 배우 조회
SELECT m.m_name AS 영화제목, d.d_name AS 감독, a.a_name AS 배우
FROM Movie m
JOIN MovieDirector md ON m.m_id = md.m_id
JOIN Director d ON md.d_id = d.d_id
JOIN MovieActor ma ON m.m_id = ma.m_id
JOIN Actor a ON ma.a_id = a.a_id
WHERE m.m_name = '올드보이';  -- 영화 제목을 여기에 입력

-- 배우 이름으로 출연한 영화 및 감독 조회

SELECT m.m_name AS 영화제목, d.d_name AS 감독, a.a_name AS 배우
FROM Movie m
JOIN MovieDirector md ON m.m_id = md.m_id
JOIN Director d ON md.d_id = d.d_id
JOIN MovieActor ma ON m.m_id = ma.m_id
JOIN Actor a ON ma.a_id = a.a_id
WHERE a.a_name = '탁태호';  -- 배우 이름을 여기에 입력

