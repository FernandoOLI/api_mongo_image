package com.api.api_mongo_image;

import com.api.api_mongo_image.domain.ImageArray;
import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfig {

    @Autowired
    private Environment env;
    private MongoClient mongoClient;
    private MongoCollection<ImageArray> collection;
    @Bean
    public MongoDatabaseFactory mongoDbFactory() {

//        mongoClient = new MongoClient("localhost", 27018);
//        MongoDatabase database = mongoClient.getDatabase("blog");
//        collection = database.getCollection("posts");
//        return MongoClients.create(env.getProperty("spring.data.mongodb.uri"));
////        return new MongoClient(new MongoClientURI(env.getProperty("spring.data.mongodb.uri")));
        return new SimpleMongoClientDbFactory(env.getProperty("spring.data.mongodb.uri"));
    }

//    @Bean
//    public MongoDbFactory mongoDbFactory() throws Exception {
//        UserCredentials userCredentials = new UserCredentials("YOUR_USER_NAME", "YOUR_PASSWORD");
//        return new SimpleMongoClientDbFactory(new Mongo(), "YOUR_DATABASE", userCredentials);
//    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}