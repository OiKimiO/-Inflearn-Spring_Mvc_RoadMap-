### 날짜 : 2023-03-23 18:03
### 주제 : MyBatis
---
### 태그
*  #xml, #SQLMapper프레임워크, #SQLMapper한계극복 , #XML단점, #MapperXML파일

### 메모
* **어디서(어떤 상황에서)**
	* **SQL문**을 **객체**와 매핑시키기 위해 XML을 사용하는 경우
	
* **어떻게(구현이 어떻게 되는지)**
	* 

* **왜(왜 사용되는지)**
	* SQL Mapper의 문제점은 SQL문과 Connection을 한 클래스에서 관리하고 있다는 문제점(SRP 원칙을 위배)
		* 이러한 문제를 해결하기 위해 MyBatis는 SQL문과 객체를 구분하여 사용 
		* 하지만, XML은 text로만 이루어 져있어 debugging이 어렵다는 단점이 있음

### 출처(참고문헌)
- https://sdesigner.tistory.com/101
* https://mybatis.org/mybatis-3/ko/index.html
### 연결문서
- [[SQL Mapper]]