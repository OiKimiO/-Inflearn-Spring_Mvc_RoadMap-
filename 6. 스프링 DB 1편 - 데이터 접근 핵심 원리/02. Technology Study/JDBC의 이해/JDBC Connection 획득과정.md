### 날짜 : 2023-03-24 09:45
### 주제 : DB Connection 획득 과정
---
### 태그
* #ConnectionPool, #JDBC_Connection_획득과정

### 메모
* **DB Connection 획득과정**
    1.  애플리케이션은 DB 드라이버를 통해 커넥션 조회
    2.  DB 드라이버는 DB와 TCP/IP 커넥션 연결
	-   이 과정에서 3 way handshake, TCP/IP연결을 위한 네트워크 동작 발생
    3.  DB 드라이버는 TCP/IP 커넥션 연결이 완료되면 ID, PWD DB에 전달
    4.  DB는 ID,PW를 통해 내부 인증완료, 내부 DB 세션 생성
    5.  DB는 커넥션 생성 완료 응답
    6.  DB드라이버는 커넥션 객체를 생성해 클라이언트에 반환

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- [[DriverManager]]