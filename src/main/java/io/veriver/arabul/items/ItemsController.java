package io.veriver.arabul.items;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	@RequestMapping(method=RequestMethod.POST, value="/addItem")
	public void addItem() {
		
	}
}
