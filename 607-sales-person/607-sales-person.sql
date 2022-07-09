/* Write your PL/SQL query statement below */



select name from salesperson where sales_id not in (select  distinct sales_id from orders where com_id = (select com_id from company where name = 'RED'));