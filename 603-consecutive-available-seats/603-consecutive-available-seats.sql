/* Write your PL/SQL query statement below */



select seat_id from Cinema c1
where free=1
and (seat_id+1 in (select seat_id from Cinema c2 where free = 1)
or seat_id - 1 in (select seat_id from Cinema c2 where free = 1)
)
order by seat_id;