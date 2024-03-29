-- 코드를 입력하세요
SELECT T1.AUTHOR_ID
     , MAX(T1.AUTHOR_NAME) AS AUTHOR_NAME
     , T1.CATEGORY
     , SUM(T1.PRICE * T2.SALES) AS TOTAL_SALES
  FROM (SELECT A.BOOK_ID, A.CATEGORY, A.PRICE, B.AUTHOR_ID, B.AUTHOR_NAME 
          FROM BOOK A
             , AUTHOR B
         WHERE A.AUTHOR_ID = B.AUTHOR_ID) T1
     , (SELECT BOOK_ID, SUM(SALES) AS SALES
          FROM BOOK_SALES
         WHERE TO_CHAR(SALES_DATE,'YYYYMM') = '202201'
         GROUP BY BOOK_ID) T2
 WHERE T1.BOOK_ID = T2.BOOK_ID
 GROUP BY T1.AUTHOR_ID, T1.CATEGORY
 ORDER BY T1.AUTHOR_ID, T1.CATEGORY DESC