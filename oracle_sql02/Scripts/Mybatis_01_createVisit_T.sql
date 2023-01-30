

select * from visit_t;


drop table visit_t;

delete from visit_t;

create table VISIT_T(
   context varchar2(500 char),
   nickname varchar2(25 char)
);

create sequence visit_s;

select visit_s.nextval from dual;

insert into visit_t values(1,'context','nickname');
insert into visit_t values(2,'context','nickname');
insert into visit_t values(3,'context','nickname');
create table VISIT_T(
   id number primary key,
   context varchar2(500 char),
   nickname varchar2(25 char)
);



commit;






create table bookmark_T(
   url varchar2(50 char),
   name varchar2(25 char)
);



insert into bookmark_T values('abc','라');
insert into bookmark_T values('abc','마');
insert into bookmark_T values('zege','가');

select * from EMPLOYEES e ;

insert into bookmark_T values('ㅇㅀㅇㅀ','엥');

insert into bookmark_T values('입력1','1번');
insert into bookmark_T values('입력2','2번');
insert into bookmark_T values('입력11','11번');
select * from bookmark_T;
commit;

delete from BOOKMARK_T ;

drop table BOOKMARK_T ;
create table bookmark_T(
   id number primary key,
   USERID varchar2(20) references USER_T(USERID),
   url varchar2(50 char),
   name varchar2(25 char)
);

create table bookmark_T(
   id number primary key,
   url varchar2(50 char),
   name varchar2(25 char)
);
select * from bookmark_T;


insert into BOOKMARK_T values(1,'https://naver.com','네이버');
insert into BOOKMARK_T values(2,'https://google.com','구글');
insert into BOOKMARK_T values(3,'https://nate.com','네이트');

select * from BOOKMARK_T ;
commit;

select max(id) from BOOKMARK_T;

create sequence BOOKMARK_S;

select BOOKMARK_S.NEXTVAL from dual;
drop sequence bookmark_S;



create table user_T(
   USERID varchar2(20) primary key,
   password varchar2(20),
   email varchar2(100)

);
select * from user_t;
commit;

select rownum,id,nickname,context
from (select * from visit_t order by id)
where rownum between 1 and 5;
-- 1부터시작하면 나오는데 중간번호부터는 안나옴 한번더 감싸야함

--이렇게 한번더 감싸준다.
select *
from(select rownum as num,id,nickname,context
	from (select * from visit_t order by id)
	)
where num between 6 and 10;



select * from visit_t order by id;

select *
	from (select rownum as num,id,userid,url,name
		from (select * from bookmark_T where userId='kaka' order by id)
		)
where num between 4 and 5;


select count(*) from bookmark_T where userId='abcd';

select * from BOOKMARK_T;




/**
 * 공지사항이 있는 게시판
 * btype 이 N 인 경우 공지사항 입니다.
 * btype 이 B 인 경우 일반 게시글 입니다.
 */
CREATE TABLE BOARD_T(
       id NUMBER PRIMARY KEY
     , btype VARCHAR2(1) CHECK(btype IN ('N', 'B'))
     , title VARCHAR2(500) NOT NULL
     , writer VARCHAR2(20) REFERENCES USER_T(userId)
     , context VARCHAR2(4000)
     , createDate DATE DEFAULT(SYSDATE)
     , updateDate DATE DEFAULT(SYSDATE)
     , viewCnt NUMBER DEFAULT(0)
);
CREATE SEQUENCE BOARD_S;

select * from user_t;
insert into user_t values('abcd',123,'abcd@naver.com');

INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 1', 'abcd', '게시글 테스트 중 입니다. 1'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 2', 'abcd', '게시글 테스트 중 입니다. 2'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 3', 'abcd', '게시글 테스트 중 입니다. 3'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 4', 'abcd', '게시글 테스트 중 입니다. 4'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'N', '공지글 테스트 1', 'abcd', '공지글 테스트 중 입니다. 1'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'N', '공지글 테스트 2', 'abcd', '공지글 테스트 중 입니다. 2'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'N', '공지글 테스트 3', 'abcd', '공지글 테스트 중 입니다. 3'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 5', 'abcd', '게시글 테스트 중 입니다. 5'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 6', 'abcd', '게시글 테스트 중 입니다. 6'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 7', 'abcd', '게시글 테스트 중 입니다. 7'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 8', 'abcd', '게시글 테스트 중 입니다. 8'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 9', 'abcd', '게시글 테스트 중 입니다. 9'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 10', 'abcd', '게시글 테스트 중 입니다. 10'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 11', 'abcd', '게시글 테스트 중 입니다. 11'
                         , DEFAULT, DEFAULT, DEFAULT);
INSERT INTO BOARD_T VALUES(BOARD_S.NEXTVAL, 'B', '일반 게시글 테스트 12', 'abcd', '게시글 테스트 중 입니다. 12'
                         , DEFAULT, DEFAULT, DEFAULT);

SELECT id, btype, title, writer, createDate, viewCnt
  FROM(SELECT ROWNUM AS NUM
            , id, btype, title, writer, createDate, viewCnt
         FROM (SELECT *
                 FROM BOARD_T
                ORDER BY BTYPE DESC, ID DESC)
  )
 WHERE NUM BETWEEN 16 AND 30;
 commit;