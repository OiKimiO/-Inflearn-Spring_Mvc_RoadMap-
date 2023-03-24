### 날짜 : 2023-03-24 08:58
### 주제 : PreparedStatement
---
### 태그
* #Statement한계극복 , #Statement 

### 메모
* **어디서(어떤 상황에서)**
	* SQL 내용을 담아야 되는 상황에서
	
* **어떻게(구현이 어떻게 되는지)**
	* connection에 PrepareStatement를 담아 사용
		* PrepareStatement의 value값은 모두 String으로 인식됨

* **왜(왜 사용되는지)**
	*  SQL Injection 공격을 방지하기 위해 사용

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- [[Statement]]