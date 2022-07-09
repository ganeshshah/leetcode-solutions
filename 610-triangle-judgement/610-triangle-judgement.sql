/* Write your PL/SQL query statement below */


select tb.*, CASE
                 when tb.x + tb.y > tb.z and 
                  tb.x + tb.z > tb.y and 
                  tb.y + tb.z > tb.x then 'Yes'
             ELSE 'No'
           END as triangle
from triangle tb;