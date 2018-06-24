package xujun.tifa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import xujun.tifa.bean.Lover;
import xujun.tifa.service.LoverService;

@Repository
public class LoverRepository implements LoverService{
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Lover> getUsers() {
		String sql = "select * from lover";
		RowMapper<Lover> rowMapper = new BeanPropertyRowMapper<Lover>(Lover.class);
		List<Lover> users = jdbc.query(sql, new Object[]{}, rowMapper);
		return users;
	}

}
