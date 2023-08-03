package com.example.Collection.Service.Dictionary;

import com.example.Collection.Model.Dictionary;
import com.example.Collection.Repository.DictionaryRepository;
import lombok.AllArgsConstructor;
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
    public Dictionary changeNameAndDescription(Dictionary dictionary) {
        Dictionary existDictionary = dictionaryRepository.findDictionaryByName(dictionary.getName())
                .orElse(null);
        Dictionary oldDictionary = dictionaryRepository.findById(dictionary.getId())
                .orElseThrow(IllegalArgumentException::new);
        if(existDictionary != null){
            throw new RuntimeException("Dictionary with this name " + dictionary.getName() + " already exist");
        }
        oldDictionary.setName(Optional.ofNullable(dictionary.getName()).orElse(oldDictionary.getName()));
        oldDictionary.setDescription(Optional.ofNullable(dictionary.getDescription()).orElse(oldDictionary.getDescription()));
        return dictionaryRepository.save(oldDictionary);
    }



}
