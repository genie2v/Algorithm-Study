-- 코드를 입력하세요
SELECT COUNT(*) AS USERS
  FROM USER_INFO
 WHERE TO_CHAR(JOINED,'yyyy') = '2021'
   AND AGE BETWEEN 20 AND 29;