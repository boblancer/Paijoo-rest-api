package com.example.paijoo_rest_api.repositories;

import com.example.paijoo_rest_api.model.database.Messages;
import com.example.paijoo_rest_api.model.database.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value="SELECT * from users u " +
            "RIGHT JOIN friendship f " +
            "ON f.user_id = :id " +
            "ORDER BY u.username"
            , nativeQuery = true)
    ArrayList<Users> getFriendListById(
            @Param("id") int id);

}
