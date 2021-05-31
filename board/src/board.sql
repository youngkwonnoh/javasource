DROP TABLE board;

CREATE TABLE board(
	bno number(8), -- 글번호
	name nvarchar2(10) not null, -- 작성자
	password varchar2(15) not null, -- 비밀번호
	title nvarchar2(50) not null, -- 제목
	content nvarchar2(1000) not null, -- 내용
	attach nvarchar2(50), -- 파일첨부
	re_ref number(8) not null, -- reply 시 참조되는 글번호
	re_lev number(8) not null, -- 댓글 레벨
	re_seq number(8) not null, -- 댓글 순서
	readcount number(8) default 0, -- 조회수
	regdate date default sysdate -- 작성날짜
);

ALTER TABLE board ADD CONSTRAINT pk_board primary key(bno);

CREATE sequence board_seq;

INSERT INTO board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
VALUES(board_seq.nextval, '홍길동', '12345', '게시판 작성', '게시판 작성', null, board_seq.currval, 0, 0);

SELECT * FROM board;

ALTER TABLE board modify(attach nvarchar2(100));

-------------------------------------------------------------------

-- 더미 데이터 생성
insert into board(bno, name, password, title, content, re_ref, re_seq, re_lev)
(select board_seq.nextval, name, password, title, content, board_seq.currval, re_seq, re_lev from board);

select count(bno) from board;

-- 가장 마지막 게시글 확인
select bno, title, re_ref, re_seq, re_lev
from board where bno = (select max(bno) from board);

-- 가장 마지막 게시글에 첫번째 댓글
insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
values(board_seq.nextval, '댓글러', '12345', 'Re:게시판 작성', 'Re:게시판 작성', null, 128, 1, 1);  


-- 가장 마지막 게시글과 게시물에 달린 댓글 가져오기
select bno, title, re_ref, re_seq, re_lev
from board where re_ref = 128 order by re_seq;

-- 두번째 댓글 삽입
-- 1. 기존 댓글의 re_seq 값을 변경
update BOARD set re_seq=re_seq+1 where re_ref = 128 and re_seq > 0;
-- 2. insert
insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
values(board_seq.nextval, '댓글러2', '12345', 'Re:데이터베이스2', 'Re:데이터베이스2', null, 128, 1, 1);

-- 댓글의 댓글 작성
-- 1. 기존 댓글의 re_seq 값을 변경
update BOARD set re_seq=re_seq+1 where re_ref = 128 and re_seq > 2;
-- 2. insert
insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
values(board_seq.nextval, '댓글러2', '12345', 'Re:데이터베이스2', 'Re:데이터베이스2', null, 128, 3, 2);

-------------------------------------------------------------------------------

select bno, title, re_ref, re_seq, re_lev
from board where re_ref = 127 order by re_seq;

-- 댓글 삽입
-- update(현재 원본글의 다른 댓글이 있다면 re_seq + 1로 변경)
-- 127(부모의 re_ref), 0(부모의 re_seq)
update BOARD set re_seq = re_seq + 1 where re_ref = 127 and re_seq > 0;

-- insert
-- 127(부모의 re_ref), 1(부모의 re_seq + 1), 1(부모의 re_lev + 1)
insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
values(board_seq.nextval, '댓글러2', '12345', 'Re:데이터베이스2', 'Re:데이터베이스2', null, 127, 1, 1);

-- 확인
select bno, title, re_ref, re_seq, re_lev
from board where re_ref = 127 order by re_seq;


-- 댓글 삽입
-- update(현재 원본글의 다른 댓글이 있다면 re_seq + 1로 변경)
-- 127(부모의 re_ref), 0(부모의 re_seq)
update BOARD set re_seq = re_seq + 1 where re_ref = 127 and re_seq > 1;

-- insert
-- 127(부모의 re_ref), 1(부모의 re_seq + 1), 1(부모의 re_lev + 1)
insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)
values(board_seq.nextval, '댓글러2', '12345', 'Re:데이터베이스', 'Re:데이터베이스', null, 127, 2, 2);

-- 확인
select bno, title, re_ref, re_seq, re_lev
from board where re_ref = 127 order by re_ref desc, re_seq asc;




-- 페이지 나누기 : rownum(가상 컬럼) 조회된 결과값에 번호를 매겨줌
select rownum, bno, title from board;
select rownum, bno, title from board order by bno desc;

select rownum, bno, title from board where rownum > 0;
select rownum, bno, title from board where rownum <= 10;

-- rownum을 사용할 때 oreder by 구문이 들어오는 경우 주의해서 사용
-- order by 구문에 index 컬럼이 들어오면 상관이 없지만 index가 아닌 컬럼이 들어오는 경우
select rownum, bno, title from board where rownum <= 10
order by re_ref desc, re_seq asc;

-- 제대로 된 번호를 매길 수 없음
select rownum, bno, title from board
order by re_ref desc, re_seq asc;

-- order by index 컬럼이 아닌 경우 : 인라인 쿼리 사용 
select rownum, bno, title
from (select rownum, bno, title from board
	  where bno > 0
	  order by re_ref desc, re_seq asc)
where rownum <= 10;


-- 가장 최신글(댓글을 원본글에 포함된 상태로)을 추출한 후 rownum을 붙여서 10개 가져오기
select rownum, A.*
from (select bno, title, name, regdate, readcount, re_lev from board
	  where bno > 0
	  order by re_ref desc, re_seq asc) A
where rownum <= 10;

-- 100개의 게시물 / 한 페이지에 10개씩 게시물 보여주기
-- 1 page => 1 ~ 10
-- 1 => (사용자가 누른 페이지번호 - 1) * 10 / 사용자가 누른 페이지 번호 * 한 페이지에 보여줄 게시물 수 
select rnum, title, name
from(select rownum rnum, A.*
	from (select bno, title, name, regdate, readcount, re_lev from board
		  where bno > 0
	  	  order by re_ref desc, re_seq asc) A
	where rownum <= 10)
where rnum > 0;

-- 2 page => 11 ~ 20
select rnum, title, name
from(select rownum rnum, A.*
	from (select bno, title, name, regdate, readcount, re_lev from board
		  where bno > 0
	  	  order by re_ref desc, re_seq asc) A
	where rownum <= 20)
where rnum > 10;

select count(*) from board;

select count(*) from board where title like '%데이터베이스%';

-- 검색
select rnum, title, name
from(select rownum rnum, A.*
	from (select bno, title, name, regdate, readcount, re_lev from board
		  where title like '%데이터베이스%' and bno > 0
	  	  order by re_ref desc, re_seq asc) A
	where rownum <= 10)
where rnum > 0;







