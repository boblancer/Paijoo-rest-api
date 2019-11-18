package com.example.paijoo_rest_api.model.database;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="friendships")
public class Friendship {

    @Id
    @Column(name = "user_id")
    private int user_id;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "friend_id")
    private int friend_id;

    @Column(name = "status")
    private RelationshipStatus relationshipStatus;
}
