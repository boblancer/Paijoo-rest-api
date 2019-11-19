package com.example.paijoo_rest_api.repositories;

import com.example.paijoo_rest_api.model.database.Messages;
import com.example.paijoo_rest_api.model.database.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value="SELECT * from " +
            "friendship f RIGHT JOIN users u ON f.user_id = u.id " +
            "where f.user_id = :id"
            , nativeQuery = true)
    ArrayList<Users> getFriendListById(
            @Param("id") int id);

}
