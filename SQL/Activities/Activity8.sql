--Activity 8
/*
Write SQL queries to get the following results:
1. Write an SQL statement to find the highest purchase amount ordered by the each customer
with their ID and highest purchase amount.
2. Write an SQL statement to find the highest purchase amount on '2012-08-17' for each 
salesman with their ID.
3. Write an SQL statement to find the highest purchase amount with their ID and order 
date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000].
*/


select customer_id, max(purchase_amount) as "Maximum amount" from orders group by customer_id;

select salesman_id, order_date, max(purchase_amount) as "Maximum amount" from orders where order_date =to_date('2012-08-17','YYYY/MM/DD') group by salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Maximum amount" FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);