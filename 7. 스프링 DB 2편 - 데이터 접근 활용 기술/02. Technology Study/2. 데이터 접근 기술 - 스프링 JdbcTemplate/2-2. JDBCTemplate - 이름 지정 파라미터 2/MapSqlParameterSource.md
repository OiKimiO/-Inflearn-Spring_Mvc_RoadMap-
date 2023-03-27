### 날짜 : 2023-03-27 15:36
### 주제 : MapSqlParameterSource
---
### 태그
* #MapSqlParameterSource

### 메모
* 메서드 체인을 통해 편리한 사용법을 제공
```java
SqlParameterSource param = new MapSqlParameterSource() 
						      .addValue("itemName", updateParam.getItemName()) 
						      .addValue("price", updateParam.getPrice()) 
						      .addValue("quantity", updateParam.getQuantity()) 
						      .addValue("id", itemId);//이 부분이 별도로 필요하다
template.update(sql, param);
```
* ItemUpdateDto에 itemId가 없어 개별적으로 적용한 케이스
	* VO에 모든 바인딩 값을 담고 있다면 BeanPropertySqlParameterSource를 사용하면 됨

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- [[SqlParameterSource]]