### 날짜 : 2023-03-27 16:17
### 주제 : SimpleJdbcInsert
---
### 태그
* #JdbcTemplate 

### 메모
	```java
		this.jdbcInsert = new SimpleJdbcInsert(dataSource)
						.withTableName("item")
						.usingGeneratedKeyColumns("id");
						.usingColumns("item_name", "price", "quantity"); // 생략 가능
	```
*  withTableName
	* 데이터를 지정할 테이블명을 입력
* usingGeneratedKeyColumns
	* key를 생성하는 PK 컬럼 명을 지정
* usingColumns
	* INSERT SQL에 사용할 컬럼 지정
* 생성 지점에 데이터베이스 테이블의 메타 데이터를 조회함, 따라서 어떤 컬럼이 있는지 확인할 수 있음으로 usingColumns를 생략할 수 있음
	* 만약 특정 컬럼만 지정해서 저장하고 싶으면 usingColumns을 사용하면 됨

### 출처(참고문헌)
-  

### 연결문서
- [[JdbcTemplate]]