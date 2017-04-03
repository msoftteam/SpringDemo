create database springdemo;

-- ตารางประเภทสินค้า
create table product_category(
	id serial primary key,
	category_name varchar(255)
);

-- ตารางสินค้า
create table products(
	id serial primary key,
	category_id integer REFERENCES product_category (id),
	product_name varchar(255),
	product_price float,
	product_qty integer
);