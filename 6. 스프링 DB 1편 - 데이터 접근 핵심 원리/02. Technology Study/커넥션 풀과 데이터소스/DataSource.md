### 날짜 : 2023-03-24 09:43
### 주제 : DataSource
---
### 태그
* #Connection, #Connection조회, #다형성 

### 메모
* **어디서(어떤 상황에서)**
	* JDBC, DBCP 등의 기술을 통해 Connection 조회와 관리가 필요한 상황에서
	
* **어떻게(구현이 어떻게 되는지)**
	 ![[Pasted image 20230324111840.png]]
	* 인터페이스인 DataSource를 통해 Connection을 조회 및 관리
	* DataSource를 통한 Connection 조회는 다양한 방식을 통해 가능
		* 각 클래스별 Connection 조회 및 관리 하는 기능 구현
		* 설정과 사용의 분리
			-  URL, USERNAME, PASSWORD와 DataSource를 분리
			- 설정과 사용을 분리할 경우
				- Repository에선 DataSource만 의존하게 되며 나머지 속성은 몰라도 됨
				- SRP를 지키는 방법

* **왜(왜 사용되는지)**
	* Connection을 조회 및 관리하는 방법에 대한 다형성을 보장
	* 이를 통해 다양한 DB Driver 구현체와의 연결 및 Connection 조회하는 방법을 표준화 할 수 있음

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- [[DBCP]]