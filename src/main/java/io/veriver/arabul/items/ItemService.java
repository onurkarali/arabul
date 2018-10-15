package io.veriver.arabul.items;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	private List<Item> items = new ArrayList<>();
	public void saveItem(final String type, final String description,
		final String city, final String district, final String url) {	
		Item newItem = Item.builder()
				.id(UUID.randomUUID().toString())
				.type(type)
				.description(description)
				.city(city)
				.district(district)
				.url(url)
				.build();
				
		items.add(newItem);
	}
	
	public Item getItem(final String id) {
		Item item = Item.builder().build();
		return item;
	}
	
	public List<Item> searchItems(final String id) {
		List<Item> itemList = Arrays.asList(Item.builder().build());
		return itemList;
	}
}
