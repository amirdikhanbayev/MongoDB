package com.example.Collection.Service.Dictionary;

import com.example.Collection.Model.Dictionary;

import java.util.List;
import java.util.Optional;

public interface DictionaryService {
    Dictionary create(Dictionary dictionary);

    List<Dictionary> listAll();

    Optional<Dictionary> findDictionaryByName(String name);

    Dictionary changeNameAndDescription(Dictionary dictionary);


}
