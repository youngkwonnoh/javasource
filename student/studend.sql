CREATE TABLE student
(
    student_no       NUMBER           NOT NULL, 
    student_name     VARCHAR2(20)     NOT NULL, 
    student_year     VARCHAR2(20)     NOT NULL, 
    student_addr     NVARCHAR2(50)    NOT NULL, 
    student_tel      VARCHAR2(20)     NOT NULL, 
    student_birth    DATE             NULL, 
    CONSTRAINT student_pk PRIMARY KEY(student_no)
);
