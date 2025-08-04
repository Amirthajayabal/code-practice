select r.contest_id ,ROUND((COUNT(DISTINCT r.user_id) / (SELECT COUNT(DISTINCT user_id) FROM Users)) * 100, 2) as percentage
from Register  r
join users u
on u.user_id=r.user_id
group by contest_id
order by percentage desc, contest_id asc;