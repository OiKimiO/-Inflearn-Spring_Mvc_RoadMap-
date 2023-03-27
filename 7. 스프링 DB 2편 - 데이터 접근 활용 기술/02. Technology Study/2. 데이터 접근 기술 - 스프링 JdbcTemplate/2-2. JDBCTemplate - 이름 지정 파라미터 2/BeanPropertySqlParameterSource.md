### 날짜 : 2023-03-27 15:38
### 주제 : BeanPropertySqlParameterSource
---
### 태그
* #BeanPropertySqlParameterSource

### 메모
* 자바 빈 프로퍼티 규약을 통해 자동으로 파라미터 객체를 생성
* SqlParameterSource param = new BeanPropertySqlParameterSource(item);
	* BeanPropertySqlParameterSource의 인자값으로 item을 넘겨준다.
	* item의 getItemName()과 getPrice()가 있다면 다음과 같은 데이터를 자동 만듦
		* key = itemName, value = 상품명 값
		* key = price, value = 가격 값
* 기능이 좋아보이긴하나 DTO에 컬럼이 없을 경우 SQL에 변수를 바인딩 할 수 없음
	* 그래서 DTO에 포함되지 않은 값을 추가하는 상황에는 바인딩할 내용을 따로 입력해야함

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- [[SqlParameterSource]]