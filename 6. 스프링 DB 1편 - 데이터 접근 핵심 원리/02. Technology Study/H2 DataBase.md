### 날짜 : 2023-03-23 15:53
### 주제 : H2 DataBase
---
### 태그
* #H2database, #H2, #테스트DB

### 메모
* 어디서(어떤 상황에서)
	* 프로젝트 DataBase 테스트 서버를 사용해야 되는경우 
	* 새로운 프로젝트할 때 Test_DataBase서버를 만드는 경우
	
* 어떻게(구현이 어떻게 되는지)
	* H2 서버 시작
		* (windows) H2 > bin > h2.bat
	* H2 웹서버 
		* 웹 주소    :  [H2 서버주소](http://localhost:8082/login.jsp?jsessionid=ace10efd7984edb62ee32184dab1e930)
			* jsessionid부분은 제거하면 안됨
		* JDBC URL : jdbc:h2:~/test
		* 사용자명  : sa
		* 비밀번호  : (없음)
	* Spring Dependency 적용
		* spring.io 생성시 H2 Database Dependency 추가

* 왜(왜 사용되는지)
	* 개발이나 테스트 용도로 사용하기 좋은 가볍고 편리함

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- 