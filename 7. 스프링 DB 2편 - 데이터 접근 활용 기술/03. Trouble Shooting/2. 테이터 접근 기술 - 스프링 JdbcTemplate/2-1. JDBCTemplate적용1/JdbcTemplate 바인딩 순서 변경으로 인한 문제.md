### 날짜 : 2023-03-27 14:42
### 주제 : JdbcTemplate 순서대로 바인딩
---
### 태그
* 

### 메모
* **경로**
	* JdbcTemplateItemRepositoryV1
	
* **문제**
	* String sql = "insert into item(item_name, price, quantity) values (?,?,?)";를 
	* String sql = "insert into item(item_name, quantity, price) values (?,?,?)";로 변경했을 때 발생될 수 있는 문제
		* 이전에 바인딩된 파라미터들로 인해 **코드**뿐만이 아니라 **데이터베이스의 데이터**도 수정해야되는 문제 발생
		* 순서대로 파라미터를 바인딩하는 것은 편하지만 여러 문제가 발생할 수 있어 주의해서 사용해야 함
* **대처**
	* JdbcTemplateItemRepositoryV2로 진행

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- 