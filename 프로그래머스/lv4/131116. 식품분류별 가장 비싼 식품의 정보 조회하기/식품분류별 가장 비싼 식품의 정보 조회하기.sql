-- 코드를 입력하세요
SELECT A.CATEGORY
     , A.MAX_PRICE
     , B.PRODUCT_NAME
  FROM (SELECT CATEGORY
             , MAX(PRICE) AS MAX_PRICE
          FROM FOOD_PRODUCT
         WHERE CATEGORY IN ('과자','국','김치','식용유')
         GROUP BY CATEGORY) A
       INNER JOIN FOOD_PRODUCT B
               ON (A.CATEGORY = B.CATEGORY AND A.MAX_PRICE = B.PRICE)
 ORDER BY A.MAX_PRICE DESC