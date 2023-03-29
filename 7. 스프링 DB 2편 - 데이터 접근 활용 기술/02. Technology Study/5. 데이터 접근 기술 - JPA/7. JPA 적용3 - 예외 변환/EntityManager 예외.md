### 날짜 : 2023-03-29 18:01
### 주제 : EntityManager 예외
---
### 태그
* 

### 메모
* EntityManager 는 순수한 JPA 기술이고, 스프링과는 관계가 없음
* 따라서 엔티티 매니저는 예외가 발생하면 JPA 관련 예외를 발생
* JPA는 PersistenceException 과 그 하위 예외를 발생
	* 추가로 IllegalStateException , IllegalArgumentException 예외를 발생 시킬 수 있음
* 14페이지 이후에 내용은 한번 더 확인 필요

### 출처(참고문헌)
-  

### 연결문서
- 