### 날짜 : 2023-03-29 17:55
### 주제 : JPA가 만들어서 실행한 Insert SQL
---
### 태그
* 

### 메모
```java
insert into item (id, item_name, price, quantity) values (null, ?, ?, ?) 또는 insert into item (id, item_name, price, quantity) values (default, ?, ?, ?) 또는 insert into item (item_name, price, quantity) values (?, ?, ?)
```
* JPA가 만들어서 실행한 SQL을 보면 id 에 값이 빠져있는 것을 확인
* PK 키 생성 전략을 IDENTITY 로 사용했기 때문에 JPA가 이런 쿼리를 만들어서 실행한 것
* Item 객체의 id 필드에 데이터베이스가 생성한 PK값이 들어감
	* JPA가 INSERT SQL 실행 이후 생성된 ID 결과를 받아서 넣어줌)

### 출처(참고문헌)
-  

### 연결문서
- 