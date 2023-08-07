package com.example.Collection.Controller;

import com.example.Collection.Model.DictionaryDocument;
import com.example.Collection.Service.DictionaryDocumentService;
import com.example.Collection.dto.DirectoryDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DictionaryDocumentController {

    private final DictionaryDocumentService dictionaryDocumentService;

    @PostMapping("/create")
    public ResponseEntity<DictionaryDocument> create(@RequestBody DictionaryDocument dictionaryDocument){
        return ResponseEntity.ok(dictionaryDocumentService.create(dictionaryDocument));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<DictionaryDocument>> all(){
        return ResponseEntity.ok(dictionaryDocumentService.listAll());
    }

    @GetMapping("/getFields/{id}")
    public ResponseEntity<List<Map<String, Object>>> getFields(@PathVariable String id) {
        DictionaryDocument document = dictionaryDocumentService.findById(id);
        return ResponseEntity.ok(document.getFields());
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        dictionaryDocumentService.delete(id);
    }
    @PutMapping("/add-data")
    public ResponseEntity<DictionaryDocument> addData(@RequestBody DirectoryDataDto dto) {
        dictionaryDocumentService.addData(dto);
        return ResponseEntity.ok(dictionaryDocumentService.findById(dto.getDictionaryId()));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<DictionaryDocument> findById(@PathVariable String id){
        DictionaryDocument document = dictionaryDocumentService.findById(id);
        return ResponseEntity.ok(document);
    }

    @PutMapping("/updateData")
    public ResponseEntity<DictionaryDocument> find(@RequestBody DirectoryDataDto dto){
        return ResponseEntity.ok(dictionaryDocumentService.updateData(dto));
    }
}