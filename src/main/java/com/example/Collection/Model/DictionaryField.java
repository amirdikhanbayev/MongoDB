package com.example.Collection.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DictionaryField {
    private String name;
    private String code;
    private String type;
    private Boolean required;
}
