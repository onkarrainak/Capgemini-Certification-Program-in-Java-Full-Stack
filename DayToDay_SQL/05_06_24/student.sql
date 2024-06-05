use school;

SELECT * FROM school.student;

insert into student values(02,'Sujay','CS');

ALTER TABLE student RENAME COLUMN class TO Workplace;

desc student;

ALTER TABLE student MODIFY Workplace varchar(10);

UPDATE student SET Workplace = 'science' WHERE rollno =6;

SELECT * FROM student WHERE Workplace = 'JAVA';

call getstudentByrollno(2);

call getstudentByWorkplace('JAVA');