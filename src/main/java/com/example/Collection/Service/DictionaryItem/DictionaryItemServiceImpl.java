package com.example.Collection.Service.DictionaryItem;

import com.example.Collection.Model.Dictionary;
import com.example.Collection.Model.DictionaryItem;
import com.example.Collection.Repository.DictionaryItemRepository;
import com.example.Collection.Repository.DictionaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DictionaryItemServiceImpl implements DictionaryItemService{
    private final DictionaryItemRepository dictionaryItemRepository;

    private final DictionaryRepository dictionaryRepository;
    @Override
    public DictionaryItem changeItemPrice(DictionaryItem dictionaryItem) {
        Optional<Dictionary> dictionary = dictionaryRepository.findDictionaryByItems(dictionaryItem);
        for(int i = 0; i <= dictionary.get().getItems().size(); i++){
            if(dictionary.get().getItems().get(i).getName() == dictionaryItem.getName()){

            }
        }
        return null;
    }

    @Override
    public Optional<DictionaryItem> findItemByName(String name) {
        return Optional.empty();
    }
}
