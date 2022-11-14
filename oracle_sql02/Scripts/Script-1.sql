select FIRST_NAME as "이 름" -- 띄어쓰기를 쓰려면 " " 로 묶어줌
from employees;

select * from EMPLOYEES e2 ;

select  CASE when e.COMMISSION_PCT is not null then '있음'
		else '없음' 
		
		END as 커미션구분 
from EMPLOYEES e  ;

select e.FIRST_NAME || e.LAST_NAME as 이름  ,e.EMPLOYEE_ID  
		, SUBSTR( e.PHONE_NUMBER ,1,3)|| '*********'||substr( e.PHONE_NUMBER ,13,18)
from EMPLOYEES e 
where e.PHONE_NUMBER like '011%';


select e.FIRST_NAME || e.LAST_NAME as 이름, TO_CHAR(e.HIRE_DATE,'""YYYY"년 "MM"월 "DD"일"') 
from EMPLOYEES e 
where EXTRACT (year from e.HIRE_DATE) =2000;


select e.FIRST_NAME || e.LAST_NAME as 이름, TO_CHAR(e.HIRE_DATE,'YYYY "년" MM "월" DD "일"') as 고용일
	, round(MONTHS_BETWEEN(TO_DATE('1999-12-31', 'YYYY-MM-DD'),e.HIRE_DATE ),2) as 근무개월수
from EMPLOYEES e 
where MONTHS_BETWEEN(TO_DATE('1999-12-31', 'YYYY-MM-DD'),e.HIRE_DATE ) >=60;

select e.HIRE_DATE  FROM EMPLOYEES e 


SELECT TO_CHAR(123456, '999,999,999') AS A
     , TO_CHAR(123456, '000,000,000') AS B
     , TO_CHAR(123456.789, '999,999,999.99999') AS C
     , TO_CHAR(123456.789, '000,000,000.00000') AS D
  FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYYMMDD') AS A
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD') AS B
     , TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS C
     , TO_CHAR(SYSDATE, 'YYYY.MM.DD') AS D
     , TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"') AS E
  FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'HH:MI:SS') AS A
     , TO_CHAR(SYSDATE, 'HH24:MI:SS') AS B
     , TO_CHAR(SYSDATE, 'HH24"시" MI"분" SS"초"') AS C
  FROM DUAL;

SELECT TO_NUMBER('1234') AS A
     , TO_NUMBER('12.34') AS B
     , TO_NUMBER('1,000', '999,999') AS C
  FROM DUAL;

SELECT TO_DATE(20221111) AS A
     , TO_DATE('20221111') AS B
     , TO_DATE('2022/11/11') AS C
     , TO_DATE('2022-11-11') AS D
     , TO_DATE('2022.11.11') AS E
     , TO_DATE('2022년 11월 11일', 'YYYY"년" MM"월" DD"일"') AS F
  FROM DUAL;

 select * 
from EMPLOYEES e
order by e.hire_date;


with table1 as
	(select e.EMPLOYEE_ID ,case when extract (year from e.HIRE_DATE) between 1980 and 1989 then '80년대'
		when extract (year from e.HIRE_DATE) between 1990 and 1999 then '90년대'
		else '2000년대'
		END as 입사년도
	from EMPLOYEES e)
select 입사년도 , count(*) as 입사자수
from table1 
group by 입사년도
order by 입사년도;

select * from EMPLOYEES e;

select DEPARTMENT_ID, count(substr(PHONE_NUMBER,1,3)) as 회선수
from EMPLOYEES e 
where department_id is not null
group by DEPARTMENT_ID 
having  count(substr(PHONE_NUMBER,1,3)) >1
order by DEPARTMENT_ID ;


create table 지출내역서(
	ID number(10) primary key,
	날짜 date,
	출입구분 varchar2(2) check (출입구분 in ('출','입')),
	금액 number(10),
	비고 varchar2(50)
);

drop table 지출내역서;










