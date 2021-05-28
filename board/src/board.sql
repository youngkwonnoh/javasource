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

