-- 코드를 입력하세요
SELECT A.MEMBER_NAME AS MEMBER_NAME
     , B.REVIEW_TEXT AS REVIEW_TEXT
     , TO_CHAR(B.REVIEW_DATE,'YYYY-MM-DD') AS REVIEW_DATE
  FROM MEMBER_PROFILE A
     , (SELECT T1.*
          FROM REST_REVIEW T1
             , (SELECT MEMBER_ID
                  FROM REST_REVIEW
                 GROUP BY MEMBER_ID
                HAVING COUNT(*) = (SELECT MAX(COUNT)
                                    FROM (SELECT MEMBER_ID, COUNT(*) AS COUNT
                                            FROM REST_REVIEW
                                           GROUP BY MEMBER_ID))) T2
         WHERE T1.MEMBER_ID = T2.MEMBER_ID) B 
 WHERE A.MEMBER_ID = B.MEMBER_ID
 ORDER BY B.REVIEW_DATE, B.REVIEW_TEXT;