package com.example.paijoo_rest_api.model.database;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="text_content")
public class TextContent {
    @Id
    private int id;
    @Column(name = "content")
    private String content;
}
