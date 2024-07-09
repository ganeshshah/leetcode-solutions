/* Write your PL/SQL query statement below */


select t2.unique_id,t1.name from Employees t1 LEFT JOIN  EmployeeUNI  t2 ON t1.id = t2.id;
