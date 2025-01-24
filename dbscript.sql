create database cataloguedb;
use cataloguedb;

create table catalogue_details(
	catalogue_id int primary key auto_increment,
    product_category varchar(20),
    product_price float,
    product_image_url varchar(200),
    product_workload int);

