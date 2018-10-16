package io.veriver.arabul.items;

import java.util.List;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public void addItem(final String type, final String description,
		final String city, final String district, final String url) {	
		Item newItem = Item.builder()
				._id(UUID.randomUUID().toString())
				.type(type)
				.description(description)
				.city(city)
				.district(district)
				.url(url)
				.build();
				
		repository.save(newItem);
	}

	public void updateItem(String _id, String type, String description, String city, String district, String url) {
		Item newItem = Item.builder()
				._id(_id)
				.type(type)
				.description(description)
				.city(city)
				.district(district)
				.url(url)
				.build();
				
		repository.save(newItem);
	}
	
	public Item getItem(final String id) {
		Item item = Item.builder().build();
		return item;
	}
	
	public List<Item> getItems(final String city, final String district) {
		return repository.findByCityAndDistrict(city, district);
	}
}
