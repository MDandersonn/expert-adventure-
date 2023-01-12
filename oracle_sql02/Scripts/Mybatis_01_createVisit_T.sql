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