package com.example.Collection.Repository;

import com.example.Collection.Model.DictionaryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DictionaryItemRepository extends MongoRepository<DictionaryItem, String> {

}
