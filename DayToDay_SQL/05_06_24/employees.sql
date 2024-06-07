use school;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(25),
    position VARCHAR(10) default 'Teacher'
);

desc employees;

insert into employees values(03,'Desai','Principal');
insert into employees (id, name) values(03,'Patil');

update employees set position = 'Teacher' where id = 05;
update employees set name = 'Modi' where id = 04;

ALTER TABLE employees MODIFY id int auto_increment;

select * from employees;
