package com.example.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}
		//usingMongoTemplateAndQuery(dictionaryRepository, mongoTemplate, title);

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