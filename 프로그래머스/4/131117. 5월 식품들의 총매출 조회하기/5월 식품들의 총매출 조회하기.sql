-- 코드를 입력하세요
SELECT A.PRODUCT_ID AS PRODUCT_ID
     , MAX(B.PRODUCT_NAME) AS PRODUCT_NAME
     , SUM(A.AMOUNT) * MAX(B.PRICE) AS TOTAL_SALES
  FROM FOOD_ORDER A
       INNER JOIN FOOD_PRODUCT B
               ON A.PRODUCT_ID = B.PRODUCT_ID
 WHERE TO_CHAR(A.PRODUCE_DATE,'YYYYMM') = '202205'
 GROUP BY A.PRODUCT_ID
 ORDER BY TOTAL_SALES DESC, PRODUCT_ID
        