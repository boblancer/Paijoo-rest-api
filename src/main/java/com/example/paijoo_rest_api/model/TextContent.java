package com.example.paijoo_rest_api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TextContent {
    @Id
    private int id;
    private String content;
}
