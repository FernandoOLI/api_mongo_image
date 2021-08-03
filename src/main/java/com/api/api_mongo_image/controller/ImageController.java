package com.api.api_mongo_image.controller;

import java.sql.SQLException;
import java.util.List;

import com.api.api_mongo_image.domain.ImageArray;
import com.api.api_mongo_image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api_mongo")
public class ImageController {

    @Autowired
    private ImageService service;

    @GetMapping(value = "/values")
    public ResponseEntity<List<ImageArray>> listar() throws SQLException {
        List<ImageArray> images = service.findAll();
        return ResponseEntity.ok().body(images);
    }
}
