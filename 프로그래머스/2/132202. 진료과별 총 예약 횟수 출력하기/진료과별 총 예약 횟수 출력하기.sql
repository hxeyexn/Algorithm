-- 코드를 입력하세요
-- V 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회
-- ..? 컬럼명 '진료과 코드', '5월예약건수'
-- V 환자 수 오름차순, 진료과 코드 오름차순
SELECT 
    MCDP_CD AS '진료과코드', 
    COUNT(*) AS '5월예약건수' 
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(*), MCDP_CD;