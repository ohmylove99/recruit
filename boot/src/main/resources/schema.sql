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