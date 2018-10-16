package io.veriver.arabul.items;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

    public Optional<Item> findById(String id);
    public List<Item> findByCity(String city);
}
