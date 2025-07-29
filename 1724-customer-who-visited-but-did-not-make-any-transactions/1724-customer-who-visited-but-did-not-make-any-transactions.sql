select v.customer_id,COUNT(v.customer_id) as count_no_trans
from visits v
LEFT JOIN Transactions t ON v.visit_id=t.visit_id
where t.transaction_id is null
GROUP BY v.customer_id;