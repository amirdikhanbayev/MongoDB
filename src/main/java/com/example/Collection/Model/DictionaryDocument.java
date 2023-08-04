package com.example.Collection.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document(collection = "dictionaries")
public class DictionaryDocument {
    @Id
    private String id;
    @Indexed(unique = true)
    private Map<String, Object> dictionaryName;
    private Map<String, Object> fields;

    public DictionaryDocument(Map<String, Object> dictionaryName, Map<String, Object> fields) {
        this.dictionaryName = dictionaryName;
        this.fields = fields;
    }
}
