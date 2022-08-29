-- 코드를 입력하세요
-- SELECT name 
-- from (select name 
--       from animal_ins 
--       order by datetime)
-- where rownum < 2;

SELECT NAME
  FROM ANIMAL_INS
 WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS);
