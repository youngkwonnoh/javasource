CREATE TABLE board(
	bno number(8), -- 글번호
	name nvarchar2(10) not null, -- 작성자
	password varchar2(15) not null, -- 비밀번호
	title nvarchar2(50) not null, -- 제목
	content nvarchar2(1000) not null, -- 내용
	attach nvarchar2(50) not null, -- 파일첨부
	re_ref number(8) not null, -- reply 시 참조되는 글번호
	re_lev number(8) not null, -- 댓글 레벨
	re_seq number(8) not null, -- 댓글 순서
	readcount number(8) not null, -- 조회수
	regdate date default sysdate -- 작성날짜
);

ALTER TABLE board ADD CONSTRAINT pk_board primary key(bno);

CREATE sequence board_seq;