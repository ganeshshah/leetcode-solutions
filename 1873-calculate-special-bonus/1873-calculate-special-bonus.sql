/* Write your PL/SQL query statement below */

select employee_id, case when MOD(employee_id,2)<>0 and substr(name,1,1)<>'M'
then salary 
else 0 end as bonus
from employees
order by employee_id;