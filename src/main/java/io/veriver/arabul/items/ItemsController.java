package io.veriver.arabul.items;

import java.util.List;

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
		itemService.addItem(type, description, city, district, null);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateItem")
	public void updateItem(@RequestParam("_id") String _id,
			@RequestParam("city") String city, 
			@RequestParam("district") String district,
			@RequestParam("type") String type,
			@RequestParam("description") String description) {
		itemService.updateItem(_id, type, description, city, district, null);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/getItems")
	public List<Item> getItems(@RequestParam("city") String city, 
			@RequestParam("district") String district) {
		return itemService.getItems(city, district);
	}
}
