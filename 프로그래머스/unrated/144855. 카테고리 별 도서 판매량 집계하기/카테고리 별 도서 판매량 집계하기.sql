-- 코드를 입력하세요
SELECT B.CATEGORY, SUM(SALES) AS TOTAL_SALES 
  FROM BOOK_SALES A
     , BOOK B
 WHERE A.BOOK_ID = B.BOOK_ID
   AND TO_CHAR(A.SALES_DATE,'YYYYMM') = '202201'
 GROUP BY B.CATEGORY
 ORDER BY CATEGORY;