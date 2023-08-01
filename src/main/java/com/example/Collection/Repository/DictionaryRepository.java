package com.example.Collection.Repository;

import com.example.Collection.Model.Dictionary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DictionaryRepository extends MongoRepository<Dictionary, String> {

}
