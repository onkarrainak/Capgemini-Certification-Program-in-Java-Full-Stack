use school;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(25),
    position VARCHAR(10) default 'Teacher'
);

desc employees;

insert into employees values(03,'Desai','Principal');
insert into employees (id, name) values(03,'Patil');

update employees set Salary = 55000 where position = 'HOD';
update employees set name = 'Modi' where id = 04;

ALTER TABLE employees MODIFY id int auto_increment;
alter table employees add Salary double;
alter table employees modify position varchar(20) unique key;

select * from employees;
select * from employees where Salary = 40000;
select * from employees where Salary like 55000;
SELECT * FROM employees ORDER BY Salary desc;

