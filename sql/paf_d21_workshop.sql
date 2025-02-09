# Creating users & granting permissions
CREATE USER 'fred' @'%'		# % is a wild card for any host
identified BY 'qweasd';		# password

GRANT ALL PRIVILEGES ON northwind.* 
TO 'fred' @'%';

flush PRIVILEGES;

USE northwind;

SELECT * FROM customers;

SELECT * FROM customers 
LIMIT 10 offset 0;

SELECT * FROM customers
WHERE id = 3;

SELECT * FROM orders;

SELECT * FROM orders
WHERE customer_id = 3;

SELECT * FROM orders
WHERE customer_id = 2;