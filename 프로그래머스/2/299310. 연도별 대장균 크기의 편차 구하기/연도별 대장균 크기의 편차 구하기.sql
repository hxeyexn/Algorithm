-- 코드를 작성해주세요
-- V 분화된 연도
-- V 분화된 연도별 대장균 크기의 편차
-- V 대장균 개체의 ID
-- 연도 오름차순, 크기의 편차 오름차순
SELECT 
    YEAR(DIFFERENTIATION_DATE) AS YEAR,
    (
        SELECT MAX(SIZE_OF_COLONY)
        FROM ECOLI_DATA
        WHERE YEAR(DIFFERENTIATION_DATE) = YEAR
    ) - SIZE_OF_COLONY AS YEAR_DEV,
    ID
FROM ECOLI_DATA
ORDER BY YEAR, YEAR_DEV;