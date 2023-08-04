package com.example.Collection.Repository;

import com.example.Collection.Model.DictionaryDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DictionaryRepository extends MongoRepository<DictionaryDocument, String> {

}
