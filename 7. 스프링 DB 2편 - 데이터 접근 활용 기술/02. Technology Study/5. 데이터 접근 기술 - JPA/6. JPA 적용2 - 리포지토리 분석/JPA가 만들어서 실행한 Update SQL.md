### 날짜 : 2023-03-29 17:57
### 주제 : JPA가 만들어서 실행한 Update SQL
---
### 태그
* 

### 메모
```java
update item set item_name=?, price=?, quantity=? where id=?
```
* em.update() 같은 메서드를 전혀 호출하지 않았음
* UPDATE SQL이 실행방법
	* JPA는 트랜잭션이 커밋되는 시점에, 변경된 엔티티 객체가 있는지 확인
	* 특정 엔티티 객체가 변경된 경우에는 UPDATE SQL을 실행
	
### 출처(참고문헌)
-  

### 연결문서
- 