package org.octopus.boot.recruit.service;

import java.util.List;

import org.octopus.boot.recruit.domain.City;
import org.octopus.boot.recruit.jdbc.CityJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityService {

	@Autowired
	private CityJdbc citiJdbc;

	public List<City> findAll() {
		return citiJdbc.findAll();
	}
}
