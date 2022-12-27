

-- 1. 80번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 부서id, 급여를 조회하시오.
SELECT first_name 이름, department_id 부서id, salary 급여
FROM employees
WHERE salary > (
	SELECT AVG(salary)
	FROM employees
	GROUP BY department_id
	HAVING department_id = 80)
	

-- 2. 'South San Francisco'에 근무하는 직원의 최소급여보다 급여를 많이 받으면서 50 번부서의 
-- 평균급여보다 많은 급여를 받는 직원의 이름, 급여, 부서명, 부서id를 조회하시오.

SELECT e.first_name, e.salary, d.department_name, d.department_id
FROM employees e
JOIN departments d ON d.department_id = e.department_id
WHERE e.salary > ( 
	SELECT MIN(salary)
	FROM employees e2
	JOIN departments d ON e2.department_id = d.department_id
	JOIN locations l ON l.location_id = d.location_id
	WHERE l.city =  'South San Francisco'
	) AND 
	e.salary > ( 
	SELECT AVG(salary)
	FROM employees
	GROUP BY department_id
	HAVING department_id = 50 )
	
	
-- 3-1. 각 직급별(job_title) 인원수를 조회하되 사용되지 않은 직급이 있다면 해당 직급도 출력결과에 포함시키시오. 
SELECT j.job_title 직급명, COUNT(*) 직급별인원수
FROM employees e
RIGHT OUTER JOIN jobs j ON e.job_id = j.job_id
GROUP BY e.job_id

-- 3-2.  직급별 인원수가 10명 이상인 직급만 출력결과에 포함시키시오.
SELECT j.job_title 직급명, COUNT(*) 직급별인원수
FROM employees e
RIGHT OUTER JOIN jobs j ON e.job_id = j.job_id
GROUP BY e.job_id
HAVING COUNT(*) >= 10

-- 4. 각 부서별 최대급여를 받는 직원의 이름, 부서명, 급여를 조회하시오.
SELECT e.first_name, e.salary, d.department_name
FROM employees e
JOIN departments d ON d.department_id = e.department_id 
WHERE (e.department_id, e.salary) IN 
(SELECT department_id, MAX(salary) FROM employees GROUP BY department_id)
ORDER BY e.department_id;

-- 5. 직원의 이름, 부서id, 급여를 조회하시오. 그리고 직원이 속한 해당 부서의 
-- 최소급여를 마지막에 포함시켜 출력 하시오.
SELECT e.first_name 이름, e.department_id 부서ID, e.salary 급여, minSalary.최소급여
FROM employees e
JOIN (
	SELECT MIN(salary) 최소급여, department_id
	FROM employees
	GROUP BY department_id
) minSalary ON minSalary.department_id = e.department_id


-- 6. 월별 입사자 수를 조회하되, 입사자 수가 10명 이상인 월만 출력하시오.
SELECT MONTH(hire_date) 월, COUNT(*) 월별입사자
FROM employees
GROUP BY MONTH(hire_date)
HAVING COUNT(*) >= 10

-- 7. 자신의 관리자(상사)보다 많은 급여를 받는 직원의 이름과 급여를 조회하시오.
SELECT e.first_name 이름, e.salary 급여
FROM employees e
JOIN employees man ON e.manager_id = man.employee_id
WHERE e.salary > man.salary

-- 8. 'Southlake'에서 근무하는 직원의 이름, 급여, 직책(job_title)을 조회하시오.
SELECT e.first_name 이름, e.salary 급여, j.job_title 직책 
FROM employees e
JOIN jobs j ON j.job_id = e.job_id
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON l.location_id = d.location_id
WHERE l.city = 'Southlake'

-- 9. 국가별 근무 인원수를 조회하시오. 단, 인원수가 3명 이상인 국가정보만 출력되어야함.
SELECT l.country_id ,COUNT(*) 근무인원수
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
GROUP BY l.country_id
HAVING COUNT(*) >=3

-- 10. 직원의 폰번호, 이메일과 상사의 폰번호, 이메일을 조회하시오. 
-- 단, 상사가 없는 직원은 '<관리자 없음>'이 출력되도록 해야 한다.
SELECT e.phone_number 직원폰번호, e.email 직원이메일, 
case 
	when man.phone_number IS NULL then '관리자없음'
	ELSE man.phone_number
END 상사폰번호, 
case 
	when man.email IS NULL then '관리자없음'
	ELSE man.email
end 상사이메일
FROM employees e
left outer JOIN employees man ON e.manager_id = man.employee_id


-- 11. 각 부서 이름별로 최대급여와 최소급여를 조회하시오. 
-- 단, 최대/최소급여가 동일한 부서는 출력결과에서 제외시킨다.
SELECT d.department_name 부서명, MAX(salary) 최대급여, MIN(salary) 최소급여
FROM employees e
JOIN departments d ON e.department_id = d.department_id
GROUP BY d.department_name
HAVING MAX(e.salary) <> MIN(e.salary)

-- 12. 부서별, 직급별, 평균급여를 조회하시오. 
--  단, 평균급여가 50번부서의 평균보다 많은 부서만 출력되어야 합니다.
SELECT 
case 
	when e.department_id IS NULL then '부서없음'
	ELSE e.department_id
END 부서명, e.job_id 직급명, AVG(salary) 평균급여
FROM employees e
GROUP BY e.department_id, e.job_id
HAVING AVG(salary) > (SELECT AVG(salary) FROM employees GROUP BY department_id HAVING department_id = 50)

