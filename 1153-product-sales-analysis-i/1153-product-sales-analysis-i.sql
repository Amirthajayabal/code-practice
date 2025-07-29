select p.product_name,s.year,s.price
from Sales as s
LEFT JOIN product  p
ON p.product_id=s.product_id;