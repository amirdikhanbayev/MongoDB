package com.example.Collection.Service.DictionaryField;

import com.example.Collection.Repository.DictionaryFieldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryFieldServiceImpl implements DictionaryFieldService {
    private final DictionaryFieldRepository dictionaryFieldRepository;
}
