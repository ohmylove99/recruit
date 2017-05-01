package org.octopus.boot.recruit.rest;

import java.util.List;

import org.octopus.boot.recruit.domain.City;
import org.octopus.boot.recruit.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/city")
public class CityRestController {

	private static Logger logger = LoggerFactory.getLogger(CityRestController.class);

	@Autowired
	private CityService cityService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<City> list() {
		return cityService.findAll();
	}

}
