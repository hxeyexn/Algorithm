-- 코드를 입력하세요
-- 아이스크림 성분 타입, 성분 타입에 대한 아이스크림의 총 주문량
-- 총주문량이 작은 순서대로 조회
-- 총주문량을 나타내는 컬럼명 TOTAL_ORDER
SELECT 
    I.INGREDIENT_TYPE,
    SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF F
JOIN
    ICECREAM_INFO I
    ON F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER;