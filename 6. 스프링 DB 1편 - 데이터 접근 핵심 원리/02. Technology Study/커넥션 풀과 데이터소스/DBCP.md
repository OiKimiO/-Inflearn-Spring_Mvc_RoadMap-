### 날짜 : 2023-03-24 11:40
### 주제 : DBCP( DataBase Connection Pool )
---
### 태그
*  #ConnectionPool , #ConnectionPool , #JDBC_Connection_획득과정 , #JDBC_Connection관리_단점, #Connection

### 메모
* **어디서(어떤 상황에서)**
	* JDBC만을 이용해 Connection 관리가 되고 있는 상황

* **어떻게(구현이 어떻게 되는지)**
	* 애플리케이션 실행시점에 Connection Pool에서 Connection을 조회
	* SQL시 Connection Pool에 있는 Connection을 가져와 DB와 연결
		* 생성된 Connection은 객체를 참조하여 사용
	* 작업 완료 후 Connection Pool에 Connection을 반납

* **왜(왜 사용되는지)**
	* JDBC를 통해 Connection을 관리할 경우 시간 소모가 크다는 단점이 있음
		* 이러한 단점을 해결하고자 Connection 사용 및 반납을 관리해주는 Connection Pool이 나옴
	* Connection 수를 관리해 무한정 연결 생성을 막아 보안이 뛰어남 

### 출처(참고문헌)
-  김영한 DB-1

### 연결문서
- 