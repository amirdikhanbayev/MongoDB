package com.example.Collection.Service.DictionaryItem;

import com.example.Collection.Repository.DictionaryItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryItemServiceImpl implements DictionaryItemService{
    private final DictionaryItemRepository dictionaryItemRepository;
}
