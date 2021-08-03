package com.api.api_mongo_image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiMongoImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMongoImageApplication.class, args);
	}

}
