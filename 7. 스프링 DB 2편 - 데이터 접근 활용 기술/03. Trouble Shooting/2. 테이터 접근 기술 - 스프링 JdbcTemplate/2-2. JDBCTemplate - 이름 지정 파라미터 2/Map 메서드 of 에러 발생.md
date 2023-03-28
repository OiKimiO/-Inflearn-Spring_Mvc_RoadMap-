### 날짜 : 2023-03-27 15:20
### 주제 :
---
### 태그
* #Map, #Java

### 메모
* **경로**
	* JdbcTemplateItemRepositoryV2
	
* **문제**
	* Map<String,Object> param = Map.of("id",id);
	* Map.of("id",id)는 param의 Map을 key값 : "id", value 값 : id로 초기화 하는 메서드 
		* of 메서드는 자바 9부터 작동함
		* java8에서는 작동하지 않음
	
* **대처**
	* param을 HashMap으로 초기화 한뒤 param에 key, value값을 추가함

### 출처(참고문헌)
-  

### 연결문서
- 