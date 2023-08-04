package com.example.Collection.Service.Dictionary;

import com.example.Collection.Model.Dictionary;
import com.example.Collection.Repository.DictionaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DictionaryServiceImpl implements DictionaryService {

    private final DictionaryRepository dictionaryRepository;

    @Override
    public Dictionary create(Dictionary dictionary){
        return dictionaryRepository.insert(dictionary);
    }

    @Override
    public List<Dictionary> listAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public Optional<Dictionary> findDictionaryByName(String name) {
        return dictionaryRepository.findDictionaryByName(name);
    }

    @Override
    public Dictionary changeName(String name, String newName) {
        Dictionary oldDictionary = findDictionaryByName(name)
                .orElseThrow(IllegalArgumentException::new);
        oldDictionary.setName(newName);
        return dictionaryRepository.save(oldDictionary);
    }



}
