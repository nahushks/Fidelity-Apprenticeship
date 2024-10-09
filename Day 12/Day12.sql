create table Customers(customer_id varchar(20) primary key, 
customer_name varchar(20), 
address varchar(20), 
phone_no bigint, 
email varchar(20)); 

create table delivery_partner(partner_id varchar(20) primary key, 
partner_name varchar(20),  
phone_no bigint, 
rating int);

create table Hotel_details(hotel_id varchar(20) primary key, 
hotel_name varchar(20),  
hotel_type varchar(20), 
rating int);



create table Orders(order_id varchar(20) primary key, 
customer_id varchar(20), 
hotel_id varchar(20), 
partner_id varchar(20), 
order_date date, 
order_amt int, 
foreign key(customer_id) references Customers(customer_id), 
foreign key(hotel_id) references Hotel_details(hotel_id), 
foreign key(partner_id) references delivery_partner(partner_id));


insert into Customers values('C001', 'John', 'Bengaluru', 7899008843, 'john@gmail.com'), 
('C002', 'Jane', 'Mangaluru', 9899008977, 'jane@gmail.com'), 
('C003', 'Mike', 'Chikkamagaluru', 5677879900, 'mike@gmail.com'), 
('C004', 'Thomas', 'Mysuru', 6788654433, 'thomas@yahoo.com');

select * from Customers;

insert into delivery_partner values('P001', 'DHL', 7666554431, 4), 
('P002', 'Ekart', 1234567894, 5), 
('P003', 'Blue Dart', 7876533326, 2), 
('P004', 'Amezon', 8900123432, 3); 

insert into Hotel_details values('H001', 'A2B', 'Veg', 4), 
('H002', 'Anand Bhavan', 'Veg', 5), 
('H003', 'Udupi', 'Non-Veg', 3), 
('H004', 'Swadista', 'Veg', 4);

insert into Orders values('O001', 'C001', 'H001', 'P001', '2023-10-05', 500), 
('O002', 'C002', 'H002', 'P002', '2023-10-06', 1000), 
('O003', 'C003', 'H003', 'P003', '2023-05-12', 750), 
('O004', 'C004', 'H004', 'P004', '2023-09-11', 500);


--Query 1
select partner_id, partner_name, phone_no from delivery_partner
where rating between 3 and 5
order by partner_id;

--Query 2
update Customers
set phone_no = 8977321100 where customer_id = 'C002';
select * from Customers


--Query 3
select customer_id, customer_name, address, phone_no from Customers
where email like '%gmail.com'
order by customer_id;

--Query 4
alter table Customers
alter column customer_id type int using customer_id::integer;


--Query 5
alter table Hotel_details rename column Rating to Hotel_Rating;
select * from Hotel_details


--Query 6
select concat(hotel_name, ' is a ', hotel_type, ' hotel') as "HOTEL INFO"
from Hotel_details
order by hotel_name desc;

--Query 7
select O.hotel_id, H.hotel_name, count(O.order_id) as "NO_OF_ORDERS"
from Orders O
join Hotel_details H on O.hotel_id = H.hotel_id
group by O.hotel_id, H.hotel_name
having count(O.order_id) > 5
order by O.hotel_id ASC;

--Query 8
select H.hotel_id, H.hotel_name, H.hotel_type
from Hotel_details H
left join Orders O on H.hotel_id = O.hotel_id and O.order_date
between '2029-05-01' and '2019-05-31'
where O.order_id is null
order by H.hotel_id asc;


--Query 9
select O.order_id, C.customer_name, H.hotel_name, O.order_amt
from Orders O
join Customers C on O.customer_id = C.customer_id
join Hotel_details H on O.hotel_id  = H.hotel_id
order by O.order_id ASC;