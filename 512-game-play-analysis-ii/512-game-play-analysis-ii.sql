/* Write your PL/SQL query statement below */

select ac.player_id, ac.device_id from activity ac, (select player_id,min(event_date) as event_date from activity group by player_id) ac2
where ac.player_id = ac2.player_id
and ac.event_date = ac2.event_date;

