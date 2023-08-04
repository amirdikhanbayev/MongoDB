package com.example.Collection.Repository;

import com.example.Collection.Model.DictionaryField;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DictionaryFieldRepository extends MongoRepository<DictionaryField, String> {
}
