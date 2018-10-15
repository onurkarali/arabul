package io.veriver.arabul.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(method=RequestMethod.POST, value="/addItem")
	public void addItem(@RequestParam("city") String city, 
			@RequestParam("district") String district,
			@RequestParam("type") String type,
			@RequestParam("description") String description) {
		itemService.saveItem(type, description, city, district, null);
	}
}
