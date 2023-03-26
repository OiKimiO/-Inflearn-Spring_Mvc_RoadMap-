### 날짜 : 2023-03-26 14:29
### 주제 : JdbcTemplate
---
### 태그
* #SQL, #SQLMapper , #Spring-jdbc기술

### 메모
* SQL을 직접 사용하는 경우엔 스프링이 제공하는 JdbcTemplate은 아주 좋은 선택지
* JDBC를 편리하게 사용 가능
	* 설정의 편리함
		* spring-jdbc라이브러리에 포함되어 있어, 별도의 설정 없이 사용 가능
	* 반복 문제 해결
		* 템플릿 콜백 패턴을 사용해, JDBC를 직접 사용할때 의 반복 작업을 대신 처리
		* 반복 작업 
			* Connection 획득
			* Statement를 준비하고 획득
			* 결과를 반복하도록 루프 실행
			* Connection 종료, Statement, ResultSet 종료
			* Transaction을 다루기 위한 동기화
			* 예외 발생시 스프링 예외 변환기 실행
			
* 단점은 동적 SQL 해결이 어려움
### 출처(참고문헌)
-  

### 연결문서
- [[SQL Mapper]]