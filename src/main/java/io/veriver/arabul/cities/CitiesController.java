package io.veriver.arabul.cities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CitiesController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/getCities")
	public List<String> getCities() {
		return cityService.getCities();
	}
	
	@RequestMapping("/getDistricts/{cityName}")
	public List<String> getDistricts(@PathVariable final String cityName) {
		return cityService.getDistricts(cityName);
	}
}
