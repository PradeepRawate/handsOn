## second highest salary ##
select employee_id, first_name, salary from employees e1 
where 1=(select count(distinct salary) from employees e2 where e2.salary>e1.salary);

## highest salary for each department ##
select d.department_name, max(salary) as "Highest Salary" from employees e, departments d 
where d.department_id = e.department_id 
group by d.department_id, d.department_name

select sysDate from DUAL;

## employyes hired between dates ##
select * from employees e 
where e.hire_date 
between to_date('01/01/1990', 'MM/dd/YYYY') and to_date('12/30/1994', 'MM/dd/YYYY');

## employees firstname starts with 'P' ##
select * from employees where upper(first_name) like '%P%'










