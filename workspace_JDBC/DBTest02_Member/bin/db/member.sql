DROP SEQUENCE MEMBERSQ;
DROP TABLE TB_MEMBER;

CREATE SEQUENCE MEMBERSQ 
NOCACHE;

CREATE TABLE TB_MEMBER(
	M_NO NUMBER PRIMARY KEY,
	M_NAME VARCHAR2(20) NOT NULL ,
	M_AGE NUMBER NOT NULL,
	M_GENDER VARCHAR2(2) CHECK(M_GENDER IN ('M' , 'F') ) NOT NULL,
	M_LOCATION VARCHAR2(20),
	M_JOB VARCHAR2(10),
	M_TEL VARCHAR2(20),
	M_EMAIL VARCHAR2(20)
);
SELECT * FROM TB_MEMBER;

INSERT INTO TB_MEMBER 
VALUES (MEMBERSQ.NEXTVAL , '김승진' , 19 , 'M' , '관악' , '학생' , '010-1234-5677' , 'KIM@NAVER.COM');
INSERT INTO TB_MEMBER 
VALUES (MEMBERSQ.NEXTVAL , '황인선' , 22 , 'M' , '강남' , '회사원' , '010-1234-5688' , 'HWANG@NAVER.COM');
INSERT INTO TB_MEMBER 
VALUES (MEMBERSQ.NEXTVAL , '김태룡' , 20 , 'M' , '진주' , '교도관' , '010-4568-5677' , 'TAE@NAVER.COM');
