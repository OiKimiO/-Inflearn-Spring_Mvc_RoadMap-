### 날짜 : 2023-03-26 15:09
### 주제 :
---
### 태그
* 

### 메모
* **경로**
	* JdbcTemplateItemRepositoryV1.java
	
* **문제**
	* JdbcTemplate가 import되지 않음
	* import되지 않은 이유가 의존성 주입이 올바르게 되지 않아서라고 판단
	
* **대처**
	* build.gradle에 spring-boot-starter-jdbc를 추가후 refresh gradle project하여 문제 해결

### 출처(참고문헌)
-  

### 연결문서
- 