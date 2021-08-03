package com.api.api_mongo_image.service;

import com.api.api_mongo_image.domain.ImageArray;
import com.api.api_mongo_image.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository arquivoRepository;


    public List<ImageArray> findAll() {
        return arquivoRepository.findAll();
    }

    public long count() {
        return arquivoRepository.count();
    }


}