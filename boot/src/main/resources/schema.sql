DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `authorities`;

create table users (
  username varchar(256),
  password varchar(256),
  enabled boolean
);

create table authorities (
  username varchar(256),
  authority varchar(256)
);

create table product (
	id integer not null auto_increment, 
	description varchar(255), 
	image_url varchar(255), 
	price decimal(19,2), 
	product_id varchar(255), 
	version integer, 
	primary key (id)
)