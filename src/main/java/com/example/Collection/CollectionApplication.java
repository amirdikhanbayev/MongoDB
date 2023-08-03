package com.example.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(DictionaryRepository dictionaryRepository, MongoTemplate mongoTemplate) {
//		return args -> {
//			DictionaryData data = new DictionaryData(
//					"ENG",
//					"Aнгл",
//					true
//			);
//			DictionaryData data2 = new DictionaryData(
//					"Spn",
//					"Испанский",
//					true
//			);
//			DictionaryField field = new DictionaryField(
//					"code",
//					"CODE",
//					"STRING",
//					true
//			);
//			String title = "Langs1";
//			Dictionary dictionary = new Dictionary(
//					title,
//					"LANGS",
//					"Языки",
//					List.of(field),
//					List.of(data, data2)
//			);
//
//			//usingMongoTemplateAndQuery(dictionaryRepository, mongoTemplate, title);
//			dictionaryRepository.findDictionaryByTitle(title).orElseThrow(IllegalArgumentException::new);
//		};
//	}

//	private void usingMongoTemplateAndQuery(DictionaryRepository dictionaryRepository, MongoTemplate mongoTemplate, String title) throws IllegalAccessException {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("title").is(title));
//
//		List<Dictionary> dictionaries = mongoTemplate.find(query, Dictionary.class);
//
//		if (dictionaries.size() > 1) {
//			throw new IllegalAccessException("Found many dictionaries with title" + title);
//		}
//		if (dictionaries.isEmpty()) {
//			dictionaryRepository.insert(dictionaries);
//		}else {
//			System.out.println(dictionaries + "exist");
//		}
//	}
}