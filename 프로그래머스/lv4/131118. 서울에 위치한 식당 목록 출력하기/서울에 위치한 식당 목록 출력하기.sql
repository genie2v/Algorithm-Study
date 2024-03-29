-- 코드를 입력하세요
SELECT MAX(A.REST_ID) AS REST_ID
     , MAX(A.REST_NAME) AS REST_NAME
     , MAX(A.FOOD_TYPE) AS FOOD_TYPE
     , MAX(A.FAVORITES) AS FAVORITES
     , MAX(A.ADDRESS) AS ADDRESS
     , ROUND(AVG(B.REVIEW_SCORE),2) AS SCORE
  FROM REST_INFO A
       INNER JOIN REST_REVIEW B
         ON A.REST_ID = B.REST_ID
 WHERE A.ADDRESS LIKE '서울%'
 GROUP BY A.REST_ID
 ORDER BY AVG(B.REVIEW_SCORE) DESC, MAX(A.FAVORITES) DESC 