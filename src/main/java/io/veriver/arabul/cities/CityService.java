package io.veriver.arabul.cities;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import org.springframework.stereotype.Service;

@Service
public class CityService {
	
	private static String CITIES_FILE = "Turkiye-il-ilce.json";
	
	private ObjectMapper mapper = new ObjectMapper();
	private List<City> cities;
	
	private CityService() {
		String file;
		try {
			file = readResource(CITIES_FILE);
			cities = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, City.class));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getCities() {
		return cities
				.stream()
				.map(city -> city.getIl())
				.collect(Collectors.toList());
	}
	
	private String readResource(final String fileName) throws IOException {
        return Resources.toString(Resources.getResource(fileName), Charsets.UTF_8);
	}
}
