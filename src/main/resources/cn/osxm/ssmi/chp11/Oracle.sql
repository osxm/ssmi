CREATE TABLE my_user(
   userid INT,
   username VARCHAR(20),
   userlevel INT unsigned
);

CREATE TABLE "T_USER" 
(	"ID" NUMBER(10,0) NOT NULL, 
	"NAME" VARCHAR2(100 BYTE), 
	"AGE" NUMBER(3,0), 
	 PRIMARY KEY ("ID")
);

select STATUS,MACHINE,OSUSER,PROGRAM from v$session where USERNAME='OSCAR999';
select STATUS,STATE,WAIT_CLASS MACHINE,OSUSER,PROGRAM from v$session where USERNAME='OSCAR999';
select * from v$session where USERNAME='OSCAR999';


CREATE SEQUENCE user_id_seq
INCREMENT by 1
START WITH 1 
NOMAXvalue 
NOCYCLE
NOCACHE; 