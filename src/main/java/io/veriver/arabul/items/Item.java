package io.veriver.arabul.items;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Item {
	private final String id;
	private final String type;
	private final String description;
	private final String city;
	private final String district;
	private final String url;
}
