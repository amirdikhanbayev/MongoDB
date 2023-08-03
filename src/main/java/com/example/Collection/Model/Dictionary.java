package com.example.Collection.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "dictionaries")
public class Dictionary {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String description;
    @JsonIgnore
    private List<DictionaryField> fields;
    private List<DictionaryItem> items;

    public Dictionary(String name, String description, List<DictionaryField> fields, List<DictionaryItem> items) {
        this.name = name;
        this.description = description;
        this.fields = fields;
        this.items = items;
    }
}
