### 날짜 : 2023-03-25 19:08
### 주제 : profile
---
### 태그
* #profile

### 메모
* 스프링은 로딩 시점에 application.properties의 spring.profiles.active 속성을 읽어 프로필로 사용
	* 따로 설정하지 않으면 spring.profiles.active는 default임
* 프로필은 로컬, 운영환경, 테스트 실행 등 다양한 환경에 따라서 다른 설정을 할 때 사용하는 정보
	* 환경에 따라 다른 스프링 빈을 등록해야 할 경우에도 프로파일을 사용할 수 있음
* 사용법
	* @Bean메서드에 @Profile을 추가하여 사용하면 됨
	* 이렇게 되면 스프링이 빈을 등록하면서 해당 메서드를 @Profile(이름)으로 등록하게 됨

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- 