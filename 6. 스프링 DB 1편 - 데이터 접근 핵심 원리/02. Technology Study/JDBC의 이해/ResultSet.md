### 날짜 : 2023-03-24 08:39
### 주제 :
---
### 태그
* , #ResultSet

### 메모
* **어디서(어떤 상황에서)**
	* SQL 요청 응답을 담아야하는 상황에서
	
* **어떻게(구현이 어떻게 되는지)**
		![[Pasted image 20230324085203.png]]
	* connection의 Statement를 통해 진행된 쿼리 내용을 ResultSet에 담아 반환
		* 예를 들어, select member_id, money라고 하면 member_id, money라는 이름으로 저장
	* ResultSet 내부에 있는 Cursor를 이동해 다음 데이터를 조회
		* true면 데이터가 있는 것
		* false면 데이터가 없는 것
	* 조회된 데이터를 getter로 읽을 수 있음

* **왜(왜 사용되는지)**
	* SQL된 데이터를 읽어내기 위해 사용됨

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- [[JDBC]]