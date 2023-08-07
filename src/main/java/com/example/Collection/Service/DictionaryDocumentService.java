package com.example.Collection.Service;
import com.example.Collection.Model.DictionaryDocument;
import com.example.Collection.dto.DirectoryDataDto;
import java.util.List;

public interface DictionaryDocumentService {
    DictionaryDocument create(DictionaryDocument dictionaryDocument);
    void delete(String id);
    List<DictionaryDocument> listAll();
    DictionaryDocument findById(String id);
    DictionaryDocument addData(DirectoryDataDto dto);
    DictionaryDocument deleteData(String id, String dataId);
    DictionaryDocument updateData(DirectoryDataDto dto);
}
