package org.octopus.boot.recruit.jdbc;

import java.util.List;

import org.octopus.boot.recruit.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityJdbc {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<City> findAll() {
		List<City> result = jdbcTemplate.query("SELECT * from City", (rs, rowNum) -> new City(rs.getLong("id"),
				rs.getString("name"), rs.getString("state"), rs.getString("country"), rs.getString("map")));

		return result;
	}
}
