

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