package com.example.Collection.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Dictionary {
    @Id
    private String id;
    @Indexed(unique = true)
    private String title;
    private String code;
    private String description;
    private List<DictionaryField> fields;
    private List<DictionaryData> data;

    public Dictionary(String title, String code, String description, List<DictionaryField> fields, List<DictionaryData> data) {
        this.title = title;
        this.code = code;
        this.description = description;
        this.fields = fields;
        this.data = data;
    }
}
