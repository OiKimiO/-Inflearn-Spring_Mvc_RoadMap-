### 날짜 : 2023-03-27 13:31
### 주제 :
---
### 태그
* #자바8, #자바11, #자바8vs자바11

### 메모
* **경로**
	* MemoryItemRepository
	
* **문제**
	```java
	The method orElseThrow(Supplier <? extends X> ) in the type Optional<Item> is 
	not applicable for the arguments ()	MemoryItemRepository.
	```
	*  에러의 내용은 Optional클래스의 orElseThrow() 메서드를 호출할 때 Supplier 타입의 객체를 전달하지 않아 예외가 발생
	* 해당 문제는 java10버전 이후엔 문제가 되지 않으나 java8인 경우 인자값을 넘겨야 에러 처리가 되지 않음
		* 집에서 사용하는 java는 11, 다른 장소에서 사용하는 것은 java 8임
	
* **대처**
	* 문제 해결을 위해 orElseThrow() 메서드의 인자값으로 () -> new Exception 처리함

### 출처(참고문헌)
-  [Optional 관련한 Java8에서의 orElseThrow 에러](https://velog.io/@minjung0/JavaSpringBoot-Optional-%EA%B4%80%EB%A0%A8%ED%95%9C-Java8%EC%97%90%EC%84%9C%EC%9D%98-orElseThrow-%EC%97%90%EB%9F%AC0)

### 연결문서
- 
