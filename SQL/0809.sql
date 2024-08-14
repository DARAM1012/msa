-- --- 문자열 처리 문제
-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
   select * 
   from employees
    where length(first_name) > 7;
-- 2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
   select *
    from employees
    where first_name like upper('%'); -- 첫글자 가져와서 비트윈 A~Z
-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
   select first_name , length(first_name), last_name
    from employees
    where last_name like ('_c%');
-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
                    
   select * , length(street_address)
    from locations
    where length(street_address) in (select min(length(street_address))
                            from locations);
                                     
-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
   select first_name, length(first_name)
   from employees
    where first_name like ('M%');

-- --- Date 타입 처리 문제
-- 1. 1987년에 입사한 사원의 이름을 출력하세요.
   select first_name, last_name
    from employees
    where hire_date = ('1987.%%.%%');
-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요
select first_name, last_name,hire_date
from employees

-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
-- 4. 6월에 입사한 사원의 이름과 성을 출력하세요.
-- 5. 부서별, 연도별 입사한 사원의 수를 구하세요. 

use hr;



-- 1. 사원정보(employees) 테이블에서 사원번호, 이름, 급여, 업무, 입사일, 상사의 사원번호를 출력하세요.
-- 단, 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하세요. (107행)

-- 2. 사원정보(employees) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary, 연봉에 $100 보너스를 추가하여 
-- 계산한 값은 Increased Ann_Salary, 급여에 $100 보너스를 추가하여 계산한 연봉은 Increased Salary라는 별칭으로 출력하세요.
-- (107행)

-- 3. 사원 정보(employees) 테이블에서 모든 사원의 이름(last_name)과 연봉을 '이름: 1 Year Salary = $연봉'형식으로 출력하고, 
-- 1 Year Salary라는 별칭을 붙여 출력하세요. (107행)

-- 4. 부서별로 담당하는 업무를 한 번씩만 출력하세요. (20행)

-- 5. 사원 정보(employees) 테이블에서 급여가 $7,000 ~ $10,000 범위 이외인 사람의 성과 이름(Name으로 별칭) 및 급여를 
-- 급여가 작은 순서대로 출력하세요. (75행)

-- 6. 사원의 성 (last_name) 중에 'e' 및 'o'글자가  포함된 사원을 출력하세요.  이때 머리글은 e AND o Name이라고 출력하세요. (10행)

-- 7. 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 5월 20일부터 1996년 5월 20일 사이에 고용된 사원들의 이름(Name으로 별칭), 
-- 사원번호, 고용일자를 출력하세요. 단 입사일이 빠른 순으로 정렬하세요. (8행)

-- 8. 수당을 받는 모든 사원의 성과 이름(Name으로 별칠), 급여(salary), 업무, 수당률(commission_pct)을 출력하세요. 
-- 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당률이 큰 순서대로 정렬하세요. (35행)

-- 9. 60번 IT부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하여 출력하세요. 출력형식은 사번, 이름과 성(Name으로 별칭), 급여,
-- 인상된 급여(Increased Salary로 별칭)순으로 출력하세요. (5행)

-- 10. 이름이 's'로 끝나는 각 사원의 이름과 업무를 다음의 예시와 같이 출력하세요. (예시 : Sigal Tobias is a PU_CLERK)
-- 출력 시 성과 이름은 첫 글자를 대문자로, 업무는 모두 대문자로 출력하고 머리글은 Employee JOBs로 표시하세요. (18행)

