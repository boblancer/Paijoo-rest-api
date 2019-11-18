package com.example.paijoo_rest_api.model.database;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="friendship")
public class Friendship {

    @Id
    @Column(name = "user_id")
    private int user_id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "friend_id")
    private Users friend_id;

    @Column(name = "status")
    private RelationshipStatus relationshipStatus;
}
