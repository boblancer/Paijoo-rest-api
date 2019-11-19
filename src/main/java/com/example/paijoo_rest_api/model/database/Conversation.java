package com.example.paijoo_rest_api.model.database;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name="conversation")
public class Conversation {
    @Id
    int id;
    @Column
    int author_id;
    @Column
    int recipient_id;


}
