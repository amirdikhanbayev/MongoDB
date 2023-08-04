package com.example.Collection.Service.DictionaryItem;

import com.example.Collection.Model.DictionaryItem;

import java.util.Optional;

public interface DictionaryItemService {

    DictionaryItem changeItemPrice(DictionaryItem dictionaryItem);

    Optional<DictionaryItem> findItemByName(String name);
}
