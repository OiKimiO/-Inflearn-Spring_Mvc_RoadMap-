### 날짜 : 2023-03-25 09:48
### 주제 : Spring Transaction 추상화
---
### 태그
* #Transaction, #추상화, #Transaction_추상화, #Spring_Transaction_추상화

### 메모
![[Pasted image 20230325094854.png]]
* PlatformTransactionManager 인터페이스
```java
package org.springframework.transaction; 
public interface PlatformTransactionManager extends TransactionManager{
	TransactionStatus getTransaction(@Nullable TransactionDefinition definition) throws TransactionException; 
	void commit(TransactionStatus status) throws TransactionException; 
	void rollback(TransactionStatus status) throws TransactionException; 
}
```
-   getTransaction()
    -   트랜잭션을 시작
    -   기존에 이미 진행중인 트랜잭션이 있는 경우 해당 트랜잭션에 참여 가능
-   commit()
    -   트랜잭션을 커밋
-   rollback
    -   트랜잭션을 롤백

### 출처(참고문헌)
-  김영한 DB-1

### 연결문서
- 