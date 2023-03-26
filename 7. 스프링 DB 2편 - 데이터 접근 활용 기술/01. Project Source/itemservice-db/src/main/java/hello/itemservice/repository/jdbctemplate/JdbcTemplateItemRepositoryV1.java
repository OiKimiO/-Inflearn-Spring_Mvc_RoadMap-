package hello.itemservice.repository.jdbctemplate;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import lombok.extern.slf4j.Slf4j;

/**
 * JdbcTemplate
 * */
@Slf4j
@Repository
public class JdbcTemplateItemRepositoryV1 implements ItemRepository{

	private final JdbcTemplate template;

	public JdbcTemplateItemRepositoryV1(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public Item save(Item item) {
		String sql = "insert into item(item_name, price, quantity) values (?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		template.update(connection -> {
			// 자동 증가 키
			PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
							  ps.setString(1,item.getItemName());
							  ps.setInt(2,item.getPrice());
							  ps.setInt(3,item.getQuantity());
		  	return ps;
		},keyHolder);
		
		long key = keyHolder.getKey().longValue();
		item.setId(key);
		return item;
	}

	@Override
	public void update(Long itemId, ItemUpdateDto updateParam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Item> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> findAll(ItemSearchCond cond) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
