### 날짜 : 2023-03-23 16:38
### 주제 : ORM(Object Relational Management)
---
### 태그
* #ORM, #JDBC, #JDBC한계극복, #SQLMapper한계극복, #JDBC_도구

### 메모
* **어디서(어떤 상황에서)**
	* 객체를 관계형 데이터 베이스 테이블과 자동으로 매핑 하는 경우
	
* **어떻게(구현이 어떻게 되는지)**
	* JPA 인터페이스와 Hibernate 구현체의 연결을 통해 DB 쿼리를 동적으로 만들어 줌
		* 동적으로 만들어진 쿼리는 JDBC를 통해 내용을 반환하게 됨

* **왜(왜 사용되는지)**
	* **JDBC**는 DB간의 연결 방식의 공통성은 있지만 DB별로 SQL 방식의 차이가 있음
	* SQL의 차이를 ORM을 이용해 어떤 Database를 사용하더라도 문제없이 사용할 수 있게 만들 수 있음 
	* 단, 쉬운 기술이 아니라 심도있는 학습이 필요함

### 출처(참고문헌)
-  스프링 DB 1편
- [ORM, SQL Mapper 차이 (velog.io)](https://velog.io/@mu1616/ORM-SQL-Mapper-%EC%B0%A8%EC%9D%B4)

### 연결문서
- 