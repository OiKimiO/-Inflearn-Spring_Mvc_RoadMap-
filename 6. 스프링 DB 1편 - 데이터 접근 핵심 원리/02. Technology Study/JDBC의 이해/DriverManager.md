### 날짜 : 2023-03-23 18:31
### 주제 : DriverManager
---
### 태그
* #JDBC, #Connection

### 메모
* **어디서(어떤 상황에서)**
	* 등록된 Driver에 맞는 Connection 요청이 필요한 상황
	
* **어떻게(구현이 어떻게 되는지)**
		![[Pasted image 20230323184047.png]]
	 * DriverManager는 JDBC 드라이버를 등록하고, 사용할 수 있도록 관리하는 클래스
	 * 애플리케이션 로직에서 Connection이 필요한 경우 DriverManager.getConnection()을 호출
	* 라이브러리에 등록된 드라이버 목록을 자동으로 인식
		* 드라이버들에게 순서대로 다음 정보를 넘겨 Connection을 획득할 수 있는지 확인
	* 찾은 Connection 구현체를 반환

* **왜(왜 사용되는지)**
	* 라이브러리에 등록된 DB 드라이버들을 관리하고 커넥션을 획득

### 출처(참고문헌)
-  https://www.ibm.com/docs/ko/i/7.3?topic=connections-java-drivermanager-class
* 스프링 DB 1편

### 연결문서
- [[Connection]]