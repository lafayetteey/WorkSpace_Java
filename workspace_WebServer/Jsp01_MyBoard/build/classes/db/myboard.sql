DROP SEQUENCE MYSEQ;
DROP TABLE MYBOARD;

CREATE SEQUENCE MYSEQ;
CREATE TABLE MYBOARD(
	MYNO NUMBER PRIMARY KEY,
	MYNAME VARCHAR2(100) NOT NULL,
	MYTITLE VARCHAR2(2000) NOT  NULL,
	MYCONTENT VARCHAR2(4000) NOT NULL,
	MYDATE DATE NOT NULL
);

INSERT INTO MYBOARD VALUES
(MYSEQ.NEXTVAL ,'관리자' , '테스트중입니다. 12312441ABACDD0 ' , SYSDATE );

SELECT * FROM MYBOARD;