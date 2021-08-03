package com.api.api_mongo_image.domain;

import lombok.Getter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Getter
@Document(collection = "image_normalize")
public class ImageArray {
    @Id
    private String _id;
    private String nome_arquivo;
    private Date data;
    private int width;
    private int height;
    private String image_normalizada;

    public ImageArray() {
    }

    public ImageArray(String _id, String nome_arquivo, Date data, int width, int height, String image_normalizada) {
        this._id = _id;
        this.nome_arquivo = nome_arquivo;
        this.data = data;
        this.width = width;
        this.height = height;
        this.image_normalizada = image_normalizada;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImage_normalizada() {
        return image_normalizada;
    }

    public void setImage_normalizada(String image_normalizada) {
        this.image_normalizada = image_normalizada;
    }
}