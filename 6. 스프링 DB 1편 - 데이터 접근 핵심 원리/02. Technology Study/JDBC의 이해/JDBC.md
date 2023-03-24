### 날짜 : 2023-03-23 15:13
### 주제 : JDBC(Java DataBase Connectivity)
---
### 태그
* #DB연결, #DB연결방식표준, #JDBC한계, #ORM, #SQLMapper, #DBCP

### 메모
* **어디서(어떤 상황에서)**
	* 어플리케이션과 DB의 연결이 필요한 상황에서
	
* **어떻게(구현이 어떻게 되는지)**
	* java.sql.Connection, java.sql.Statement, java.sql.ResultSet 등과 같은 인터페이스와 DB Driver(Oracle, Mysql 등) 구현체의 연결을 통해 어플리케이션과 DB를 연결할 수 있음
		* 구체적으로 DB 연결 과정으로 보면 아래와 같다.
		* DriverManager를 이용해 Connection 인스턴스를 얻음
		* Connection을 통해 Statement를 얻음
		* Statement를 이용해 ResultSet을 얻음
		
* **왜(왜 사용되는지)**
	* 과거엔 다른 종류의 데이터베이스로 변경할 경우 **연결시 사용된 코드를 모두 변경**하는 **문제 발생**
	* 이에, java에서 DB 연결 방식의 표준 인터페이스(java.sql.Connection,java.sql.Statement, 
	   java.sql.ResultSet)를 제작
		*  이후 java의 DB 연결 방식의 표준을 지키는 DB 벤더사의 Driver(=구현체)만 받으면  
		   DB 연결이 가능해짐 
		* 하지만 JDBC만으로 DB를 연결하면 **중복코드가 많아지고 Connection 관리를 계속 해야함** 
	* 하지만, **각 데이터베이스마다 ANSI SQL 표준이 다르다는 문제**로 DB Driver를 변경해도 **SQL은 변경해야한다는 단점**이 있음

### 출처(참고문헌)
-  스프링 DB 1편

### 연결문서
- 