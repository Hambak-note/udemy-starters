-- 기본 1
SELECT CONCAT(last_name, ' ', first_name) AS '이름', (salary*12) AS '연봉'
FROM employees
WHERE salary*12 >= 17000;

-- 기본 2
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여'
FROM employees
WHERE manager_id IS NULL;

--기본 3
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', hire_date AS '입사일'
FROM employees
WHERE hire_date < '20040101';

--기본 4
SELECT department_id AS '부서코드', department_name AS '부서명'
FROM departments;

--기본 5
SELECT job_id AS '직종코드', job_title AS '직종명'
FROM jobs;

-- 논리연산자 1
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', department_id AS '부서ID'
FROM employees
WHERE department_id IN (80, 50) AND salary >= 13000;


-- 논리 연산자2
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', department_id AS '부서ID', hire_date AS '입사일'
FROM employees
WHERE hire_date >= '20050101' AND (salary BETWEEN 1300 AND 20000);


-- 비교연산자 3
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', department_id AS '부서ID', hire_date AS '입사일'
FROM employees
WHERE hire_date BETWEEN '20050101' AND '20051231';

-- 비교 연산자 4
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', job_id AS '직종코드'
FROM employees
WHERE job_id LIKE '%CLERK%';


-- 비교 연산자 5
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', hire_date AS '입사일'
FROM employees
WHERE hire_date LIKE '_____12%';

-- 비교 연산자 6
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', hire_date AS '입사일'
FROM employees
WHERE (CONCAT(last_name, ' ', first_name)) LIKE '%le%'; 

-- 비교 연산자 7
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', hire_date AS '입사일'
FROM employees
WHERE (CONCAT(last_name, ' ', first_name)) LIKE '%m'; 

-- 비교 연산자 8
SELECT CONCAT(last_name, ' ', first_name) AS '이름', salary AS '급여', hire_date AS '입사일'
FROM employees
WHERE (CONCAT(last_name, ' ', first_name)) LIKE '__d%'; 

--비교 연산자 9
SELECT CONCAT(last_name, ' ', first_name) AS '이름', commission_pct AS '커미션' ,salary AS '급여'
FROM employees
WHERE commission_pct IS NOT NULL; 

-- 비교 연산자 10
SELECT CONCAT(last_name, ' ', first_name) AS '이름', commission_pct AS '커미션' ,salary AS '급여'
FROM employees
WHERE commission_pct IS NULL; 

-- 기타 1
SELECT *
FROM employees
WHERE department_id IN (30, 50, 80) AND salary BETWEEN 5000 AND 17000 AND commission_pct IS NOT null
ORDER BY hire_date, salary DESC;

-- 기타 2
SELECT department_id,MAX(salary), MIN(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary) <> MIN(salary);

-- 기타 3
SELECT department_id AS '부서ID', COUNT(*) AS '인원수'
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 5;