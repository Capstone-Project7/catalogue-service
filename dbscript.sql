create database cataloguedb;
use cataloguedb;

create table catalogue_details(
	catalogue_id int primary key auto_increment,
    product_category varchar(20),
    product_price float,
    product_image_url varchar(200),
    product_workload int);

insert into catalogue_details (product_category, product_price, product_image_url, product_workload)
    values ('Shirt', 500, 'https://images-cdn.ubuy.co.in/653d4205bf892d42fa59b8b0-men-casual-formal-shirts-slim-fit-shirt.jpg', 2),
           ('Pants', 800, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSG17fEoyTgrA7OLkaJuSIe85bC2xXMqk5d-gGebEVcBtwMM1bPopHIckjzceOumXTfIp8&usqp=CAU',2),
           ('Formal Suit',3000,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfsjLnN36MHT-ObO6iyxfqVhFQwEVJam5nAA&s'),
           ('Tie',250,'https://images-cdn.ubuy.co.in/64d4f3f1e9afef22ea77a467-4pcs-mens-ties-men-s-necktie-classic-tie.jpg',1);