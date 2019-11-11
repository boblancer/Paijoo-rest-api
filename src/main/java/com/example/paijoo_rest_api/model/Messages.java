package com.example.paijoo_rest_api.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Messages {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "author_id")
    private int author_id;
    @Column(name = "recipient_id")
    private int recipient_id;
    @Column(name = "content_type")
    private int content_type;
    @Column(name = "content_id")
    private int content_id;
    @Column(name = "seen")
    private Boolean seen;
}
