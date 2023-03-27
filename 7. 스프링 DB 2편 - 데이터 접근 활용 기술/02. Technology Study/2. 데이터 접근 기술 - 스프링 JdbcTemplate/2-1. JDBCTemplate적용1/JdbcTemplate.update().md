### 날짜 : 2023-03-27 14:00
### 주제 : JdbcTemplate.update()
---
### 태그
* #JdbcTemplate, #update

### 메모
* **어디서(어떤 상황에서)**
	* 데이터를 CUD하는 상황에서
	
* **어떻게(구현이 어떻게 되는지)**
	* PreparedStatement의 쿼리문과 update의 인자값으로 전달
	* C : Create
		``` java
		String sql = "insert into item (item_name, price, quantity) values (?, ?, ?)";
		KeyHolder keyHolder = new GeneratedKeyHolder(); 
		template.update(connection -> { 
			//자동 증가 키 
			/* connection.prepareStatement(sql, new String[]{"id"});
			   를 사용해 id를 지정하면 insert 쿼리 실행 후 데이터베이스에서 생성된 
			   ID값을 확인 할 수 있음
			*/
			PreparedStatement ps = connection.prepareStatement(sql, 
												      new String[]{"id"});
			ps.setString(1, item.getItemName()); 
			ps.setInt(2, item.getPrice()); 
			ps.setInt(3, item.getQuantity()); 
			return ps; 
		}, keyHolder)
	   ```
	* U : Update
	```java
		public void update(Long itemId, ItemUpdateDto updateParam) { 
			String sql = "update item set item_name=?, price=?, quantity=? where id=?";
			template.update(sql, 
							updateParam.getItemName(), 
						    updateParam.getPrice(), 
						    updateParam.getQuantity(), 
						    itemId); 
		}
	```

* **왜(왜 사용되는지)**
	* CUD하기 위해 사용

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- [[JdbcTemplate]]