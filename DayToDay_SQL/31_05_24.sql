use company;

drop table emp;
show tables;

create table employee (emp_id int primary key auto_increment,
						emp_name varchar(25) not null,
                        emp_age int check(emp_age >=20),
                        emp_email varchar(25) unique,
                        emp_salary long,
                        emp_city varchar(15) default 'Mumbai'
                        ); 
		
desc employee;

 insert into employee(emp_name,emp_age,emp_salary,emp_email,emp_city) 
					values('Chaitanya',24,40000,'chaitanya@gmail.com',''),
						('Sujay',25,30000,'sujay@gmail.com','Kolhapur'),
						('Sourabh',25,25000,'sourabh@gmail.com','Pune'),
						('Pooja',30,60000,'pooja@gmail.com','');
                    
insert into employee(emp_name,emp_age,emp_salary,emp_email)
					values('Akash',29,80000,'varad123@gmail.com');

update employee set emp_city = 'Mumbai' where emp_id = 5;

select max(emp_salary) from employee;

select min(emp_salary) from employee;

select emp_salary from employee order by emp_salary desc;

select emp_salary from employee order by emp_salary desc limit 2,1;

select * from employee where emp_id in(2,5);

select * from employee where emp_id between 2 and 5;

 select * from employee;