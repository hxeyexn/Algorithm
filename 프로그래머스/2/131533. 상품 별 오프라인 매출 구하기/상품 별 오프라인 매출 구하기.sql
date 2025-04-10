-- 코드를 입력하세요
-- 상품코드 별 매출액 합계
-- 매출액 기준 내림차순, 상품코드 기준 오름차순
SELECT 
    PRODUCT_CODE,
    SUM(PRICE * SALES_AMOUNT) AS SALES
FROM PRODUCT P
JOIN
    OFFLINE_SALE O
    ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES DESC, P.PRODUCT_CODE;
    
