-- memberTBL
-- 아이디(문자 15) pk -- userid
-- 비밀번호(문자 20) not null -- passoword
-- 이름(문자 20) not null -- name
-- 성별(문자 10) not null -- gender
-- 이메일(문자 50) -- email
CREATE TABLE memberTBL (
	userid VARCHAR2(15),
	password VARCHAR2(20) NOT NULL,
	name VARCHAR2(20) NOT NULL,
	gender VARCHAR2(10) NOT NULL,
	email VARCHAR2(50) NOT NULL,
	CONSTRAINT memberTBL_pk PRIMARY KEY(userid)
);


-- 한 명 추가
INSERT INTO memberTBL(userid, password, name, gender, email)
values('hong123', 'hong1234', '홍길동', '남', 'hong123@gmail.com');

select * from memberTBL;