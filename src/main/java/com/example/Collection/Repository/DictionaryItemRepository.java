package com.example.Collection.Repository;

import com.example.Collection.Model.DictionaryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DictionaryItemRepository extends MongoRepository<DictionaryItem, String> {
    Optional<DictionaryItem> findAllByName(String name);
}
