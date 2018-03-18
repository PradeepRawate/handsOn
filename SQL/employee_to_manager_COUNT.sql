select DISTINCT e.emp_id as manager_id , e.emp_name as manager_name
from employees e, employees m 
where e.emp_id = m.mng_id;

select count(e.emp_id) as emp_count , e.emp_name as manager_name
from employees e, employees m 
where e.emp_id = m.mng_id
group by m.mng_id;

select count(e.emp_id) as emp_count , e.emp_name as manager_name
from employees e, employees m 
where e.emp_id = m.mng_id
group by m.mng_id 
having count(e.emp_id) > 1;