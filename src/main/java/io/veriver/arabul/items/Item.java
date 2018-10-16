package io.veriver.arabul.items;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Document(collection="items")
public class Item {
	@Id
	public final String _id;
	public final String type;
	public final String description;
	public final String city;
	public final String district;
	public final String url;
	
	@Override
    public String toString() {
        return String.format(
                "Item [id=%s, city='%s', district='%s']",
                _id, city, district);
    }
}
