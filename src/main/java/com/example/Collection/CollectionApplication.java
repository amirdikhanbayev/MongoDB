package com.example.Collection;

import com.example.Collection.Model.Dictionary;
import com.example.Collection.Model.DictionaryData;
import com.example.Collection.Model.DictionaryField;
import com.example.Collection.Repository.DictionaryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DictionaryRepository dictionaryRepository){
		return args -> {
			DictionaryData data = new DictionaryData(
					"ENG",
					"Aнгл",
					true
			);
			DictionaryData data2 = new DictionaryData(
					"Spn",
					"Испанский",
					true
			);
			DictionaryField field = new DictionaryField(
					"code",
					"CODE",
					"STRING",
					true
			);
			Dictionary dictionary = new Dictionary(
					"Langs1",
					"LANGS",
					"Языки",
					List.of(field),
					List.of(data, data2)
			);

			dictionaryRepository.insert(dictionary);
		};
	}
}
