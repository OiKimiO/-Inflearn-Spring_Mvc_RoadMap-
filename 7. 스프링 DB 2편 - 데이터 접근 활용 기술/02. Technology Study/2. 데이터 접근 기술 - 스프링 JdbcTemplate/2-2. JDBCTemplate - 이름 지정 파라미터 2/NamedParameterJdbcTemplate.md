### 날짜 : 2023-03-27 15:26
### 주제 : NamedParameterJdbcTemplate
---
### 태그
* #JdbcTemplate , #NamedParameterJdbcTemplate

### 메모
* 이름 기반 파라미터 바인딩을 지원(권장)
* dataSource 의존관계 주입을 통해 내부에서 NamedParameterJdbcTemplate을 생성해 가지고 있음
* NamedParameterJdbcTemplate을 스프링 빈으로 직접 등록하고 주입받아도 됨

### 출처(참고문헌)
-  김영한 DB-2

### 연결문서
- [[JdbcTemplate]]