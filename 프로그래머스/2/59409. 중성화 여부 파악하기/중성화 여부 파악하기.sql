-- 코드를 입력하세요
-- 동물의 아이디, 이름, 중성화 여부
-- 중성화가 되어있다면 'O', 아니면 'X'
-- 아이디 순으로 조회
SELECT 
    ANIMAL_ID,
    NAME,
    IF(SEX_UPON_INTAKE LIKE 'Neutered%' OR SEX_UPON_INTAKE LIKE 'Spayed%', 'O', 'X') AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;