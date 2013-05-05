CREATE SCHEMA s2sh;
use s2sh;
CREATE TABLE user(
	id int not null,
	firstname varchar(20),
	lastname varchar(20),
	age int,
	PRIMARY KEY (id)
);
GRANT ALL ON s2sh.* TO 'root'@'127.0.0.1' IDENTIFIED BY 'root';