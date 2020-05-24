GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

CREATE USER 'springuser'@'%' IDENTIFIED BY 'l05n3n3';
GRANT ALL ON ecommerce.* TO 'springuser'@'%';
