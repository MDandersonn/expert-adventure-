create table VISIT_T(
	context varchar2(500 char)
);

select * from visit_t;


drop table visit_t;


create table VISIT_T(
	context varchar2(500 char),
	nickname varchar2(25 char)
);

insert into visit_t values('context','nickname');

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
	url varchar2(50 char),
	name varchar2(25 char)
);


insert into BOOKMARK_T values(1,'https://naver.com','네이버');
insert into BOOKMARK_T values(2,'https://google.com','구글');
insert into BOOKMARK_T values(3,'https://nate.com','네이트');

select * from BOOKMARK_T ;
commit;