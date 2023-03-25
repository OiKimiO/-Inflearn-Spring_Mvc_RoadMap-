### 날짜 : 2023-03-25 10:04
### 주제 : AOP를 통한 트랜잭션 문제 프록시 도입으로 해결
---
### 태그
* #Proxy, #Aop, #Transaction , #TestConfiguration

### 메모
* 기존 트랜잭션 로직![[Pasted image 20230325100658.png]]
	* 프록시 도입전 서비스 로직에서 트랜잭션 처리
	* 프록시 도입 후![[Pasted image 20230325100759.png]]
		* 프록시를 사용하면 트랜잭션을 처리하는 객체와 비즈니스 처리를 하는 서비스 객체를 명확히 분리
		```java
		public class TransactionProxy { 
			private MemberService target;
			 
			public void logic() { 
				//트랜잭션 시작 
				TransactionStatus status = transactionManager.getTransaction(..); 
				try { 
					//실제 대상 호출 
					target.logic(); 
					transactionManager.commit(status); 
					//성공시 커밋 
				} catch (Exception e) { 
					transactionManager.rollback(status); 
					//실패시 롤백 
					throw new IllegalStateException(e); 
				} 
			} 
		}
	   ```
	* 스프링이 제공하는 AOP기능을 사용하면 프록시를 편리하게 사용 가능
		* 스프링 부트를 사용하면 트랜잭션 AOP를 처리하기 위해 필요한 스프링 빈들도 자동으로 등록
	* 사용 기술
		* @Transactional
			* 스프링이 제공하는 트랜잭션 AOP
			- 클래스, 메서드에 사용
		* @SpringBootTest
			* 스프링 AOP를 적용하려면 스프링 컨테이너 필요
			* 테스트에서 @Autowired등을 통해 스프링 컨테이너가 관리하는 빈 사용 가능
		* @TestConfiguration
			* 테스트 안에서 내부 설정 클래스를 만들어 줌
			* Bean들에 추가로 필요로 하는 스프링 Bean 등록 가능
			* AOP 프록시가 잘 적용되었는지 체크 필요
				* 체크를 확인하는 방법
					```java
				void AopCheck() { 
					log.info("memberService class={}", memberService.getClass()); 
					log.info("memberRepository class={}", 
							  memberRepository.getClass()); 
				    Assertions.assertThat(AopUtils.isAopProxy(memberService))
				    .isTrue(); 
					Assertions.assertThat(AopUtils.isAopProxy(memberRepository))
					.isFalse(); 
				}
				   ```
					* memberService는 프록시(CGLIB)가 적용됨
					* memberRepository는 프록시가 적용되지 않음
					
	 * 트랜잭션 AOP적용 전체 흐름![[Pasted image 20230325101215.png]]
	* **선언적 트랜잭션 관리** vs **프로그래밍 방식 트랜잭션 관리**
	    - **선언적 트랜잭션 관리(Declarative Transaction Management)**
		- @Transactional 애노테이션 하나만 선언에 편리하게 트랜잭션을 적용
		- XML에서도 사용할 수 있음
		- **실무**에선 대부분 **선언적 트랜잭션 관리**를 사용
	    - **프로그래밍 방식의 트랜잭션 관리(Programmatic Transaction Management)**
	        - **트랜잭션 매니저** 또는 **트랜잭션 템플릿**을 통해 트랜잭션 관련코드를 직접 작성

### 출처(참고문헌)
-  김영한 DB-1

### 연결문서
- 