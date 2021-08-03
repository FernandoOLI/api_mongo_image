package com.api.api_mongo_image.repository;

import com.api.api_mongo_image.domain.ImageArray;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<ImageArray, String> {

}