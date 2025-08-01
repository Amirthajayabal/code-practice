select employee.name,bonus.bonus
from employee
LEFT JOIN bonus on Employee.empID=bonus.empID
where bonus<1000 or bonus is null;