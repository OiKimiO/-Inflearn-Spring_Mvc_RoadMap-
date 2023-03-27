### 날짜 : 2023-03-27 14:22
### 주제 : JdbcTemplate.query()
---
### 태그
* #JdbcTemplate, #query

### 메모
* 하나 이상의 데이터를 조회할 때 사용
* template.query(sql, RowMapper(), param.toArray());
	* sql 쿼리문을 실행하기 전 조건문을 확인
		* 조건문이 있을 경우 동적으로 sql을 추가할 때 조건문에 대한 배열을 전달
		* param.toArray()의 형태로 전달
			* sql에서 바인딩 변수의 개수 만큼 배열의 원소를 추가시켜야 함
	* 이후 결과 문을 RowMapper에 반환함

### 출처(참고문헌)
-  

### 연결문서
- 