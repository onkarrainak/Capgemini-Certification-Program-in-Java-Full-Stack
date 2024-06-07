use school;

SELECT * FROM school.student;

insert into student values(02,'Sujay','CS');

ALTER TABLE student RENAME COLUMN class TO Workplace;

ALTER TABLE student MODIFY rollno int auto_increment;

desc student;

ALTER TABLE student MODIFY Workplace varchar(10);

UPDATE student SET name = 'Chetu' WHERE rollno =4;
UPDATE student SET Workplace = 'Pune' WHERE Workplace = "JAVA";
UPDATE student SET Workplace = 'Mumbai' WHERE name = "Vishal";

SELECT * FROM student WHERE Workplace = 'JAVA';

call getstudentByrollno(2);

call getstudentByWorkplace('JAVA');