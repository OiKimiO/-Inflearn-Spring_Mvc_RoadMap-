### 날짜 : 2023-03-25 18:47
### 주제 : @EvenetListener(ApplicationReadyEvent.class)
---
### 태그
* #EventListener, #ApplicationReadyEvent

### 메모
* 스프링 컨테이너가 완전히 초기화를 다 끝내고 실행 준비가 완료되었을 때 발생하는 이벤트
* 참고로,  이 기능 대신 @PostConstruct를 사용할 경우 AOP같은 부분이 미처리된 시점에서 호출 될 수 있음
	* 예를 들어 @Transactional과 관련된 AOP가 적용되지 않을 수도 있음
	* @EvenetListener(ApplicationReadyEvent.class)는 AOP를 포함한 스프링 컨테이너가 완전히 초기화된 후 호출됨

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- 