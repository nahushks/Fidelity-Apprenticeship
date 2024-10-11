create table worker(worker_id int primary key, first_name varchar(100) not null, last_name varchar(100) not null,
salary int not null, joining_date date not null, department varchar(100) not null);
create table title(worker_ref_id int not null, worker_title varchar(100) not null, affected_from date not null, foreign key(worker_ref_id) references worker(worker_id));
create table bonus(worker_ref_id int not null references worker(worker_id), bonus_amount decimal(12,2) not null,
bonus_date date not null);
insert into worker values(1, 'Ajay', 'Das',100000, '2020-02-14','HR' ),(2, 'Niharika', 'Verma',80000, '2011-02-14','Admin'),
(3, 'Vishal', 'Singhal',300000, '2020-02-14','HR'),(4, 'Amithab', 'singh',500000, '2020-02-14','Admin'),(5, 'Vivek', 'Bhati',500000, '2011-06-14','Admin'),
(6, 'Vipul', 'Diwan',200000, '2011-06-14','Account'),(7, 'Satish', 'Kumar',75000, '2020-01-14','Account'),(8, 'Geethika', 'Chauhan',90000, '2011-04-14','Admin');
 
insert into bonus values(1, 5000, '2020-02-16'),(2, 3000, '2011-06-16'),(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),(2, 3500, '2011-02-16'),(4, 4500, '2020-02-16'),(5, 3500, '2011-02-16');
 
insert into title values(1,'Manager','2016-02-20'),(2,'Executive','2016-06-11'),(8,'Executive','2016-02-20'),
(5,'Manager','2016-06-11'),(4,'Asst-Manager','2016-06-11'),(7,'Executive','2016-06-11'),(6,'Lead','2016-06-11'),
(3,'Lead','2016-06-11');

--QUERY 1
select w.first_name, w.salary, t.worker_title from worker w join title t on w.worker_id= t.worker_ref_id;

--QUERY 2
create or replace function
get_worker_count_by_nth_highest_salary(n int)
returns integer as $$
declare 
	nth_highest_salary decimal;
	worker_count integer;
begin	
	select distinct salary 
	into nth_highest_salary
	from worker
	order by salary desc 
	offset n - 1 limit 1;
 
	if nth_highest_salary is null then 
		return 0;
	end if;
 
	select count(*)
	into worker_count 
	from worker 
	where salary = nth_highest_salary;
 
	return worker_count;
end;
$$language plpgsql;
 
select get_worker_count_by_nth_highest_salary(1);

