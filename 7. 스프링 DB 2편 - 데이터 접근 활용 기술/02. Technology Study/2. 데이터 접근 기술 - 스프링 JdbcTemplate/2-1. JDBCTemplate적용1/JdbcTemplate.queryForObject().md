### 날짜 : 2023-03-27 14:13
### 주제 : JdbcTemplate.queryForObject()
---
### 태그
* #JdbcTemplate, #queryForObject

### 메모
* 로우의 결과가 하나일 경우 사용
* queryForObject(sql, RowMapper, id)
	* sql의 결과를 RowMapper에 담는다.
	* 3번째 인자값 부터는 쿼리 조건문을 입력하면 됨
	* 결과가 없으면 EmptyResultDataAccessException 예외가 발생
	* 결과가 둘 이상이면 IncorrectResultSizeDataAccessException 예외가 발생

### 출처(참고문헌)
-  

### 연결문서
- [[JdbcTemplate]]