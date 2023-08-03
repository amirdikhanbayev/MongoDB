package com.example.Collection.Controller;

import com.example.Collection.Model.Dictionary;
import com.example.Collection.Service.Dictionary.DictionaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionary")
public class DictionaryController {
    private final DictionaryService dictionaryService;
    @PostMapping("/create")
    public ResponseEntity<Dictionary> create(@RequestBody Dictionary dictionary){
        Dictionary dictionary1 = dictionaryService.create(dictionary);
        return ResponseEntity.ok().body(dictionary1);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Dictionary>> dictionaries(){
        List<Dictionary> dictionaries = dictionaryService.listAll();
        return ResponseEntity.ok(dictionaries);
    }

    @PostMapping ("/find")
    public ResponseEntity<Optional<Dictionary>> find(@RequestBody Dictionary dictionary){
        Optional<Dictionary> dictionary1 = dictionaryService.findDictionaryByName(dictionary.getName());
        return ResponseEntity.ok(dictionary1);
    }

    @GetMapping("/changeNameAndDescription")
    public ResponseEntity<Dictionary> change(@RequestBody Dictionary dictionary){
        Dictionary dictionary1 = dictionaryService.changeNameAndDescription(dictionary);
        return ResponseEntity.ok(dictionary1);
    }

}
