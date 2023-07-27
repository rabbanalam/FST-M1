--Activity 7 
/*Write SQL queries to get the following results:
Write an SQL statement to find the total purchase amount of all orders.
Write an SQL statement to find the average purchase amount of all orders.
Write an SQL statement to get the maximum purchase amount of all the orders.
Write an SQL statement to get the minimum purchase amount of all the orders.
Write an SQL statement to find the number of salesmen listed in the table. */

select sum(purchase_amount) as "Total Amount" from orders; 

select avg(purchase_amount) as "Average amount" from orders;

select max(purchase_amount) as "Maximum amount" from orders;

Select min(purchase_amount) as "Minimum Amount" from orders;

select count(distinct salesman_id) as "Total No of Salesman" from orders;