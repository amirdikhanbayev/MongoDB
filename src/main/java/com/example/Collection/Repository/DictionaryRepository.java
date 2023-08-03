package com.example.Collection.Repository;

import com.example.Collection.Model.Dictionary;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DictionaryRepository extends MongoRepository<Dictionary, String> {
    Optional<Dictionary> findDictionaryByName(String name);
}
