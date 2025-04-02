-- 코드를 입력하세요
SELECT T1.HISTORY_ID
     , T1.DAILY_FEE * T1.PERIOD * (100 - NVL(T2.DISCOUNT_RATE,0)) / 100 AS FEE
  FROM (SELECT A.CAR_ID 
             , A.CAR_TYPE
             , A.DAILY_FEE
             , B.HISTORY_ID
             , (B.END_DATE - B.START_DATE + 1) AS PERIOD
             , CASE WHEN (B.END_DATE - B.START_DATE + 1) >= 90 THEN '90일 이상'
                    WHEN (B.END_DATE - B.START_DATE + 1) BETWEEN 30 AND 89 THEN '30일 이상'
                    WHEN (B.END_DATE - B.START_DATE + 1) BETWEEN 7 AND 29 THEN '7일 이상'
               ELSE '' END AS DURATION_TYPE
          FROM CAR_RENTAL_COMPANY_CAR A
               LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
                      ON A.CAR_ID = B.CAR_ID
         WHERE A.CAR_TYPE = '트럭') T1
       LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN T2
              ON T1.CAR_TYPE = T2.CAR_TYPE
             AND T1.DURATION_TYPE = T2.DURATION_TYPE
 ORDER BY FEE DESC, HISTORY_ID DESC