package com.example.Collection.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class DictionaryItem {
    private String name;
    private double price;
}
