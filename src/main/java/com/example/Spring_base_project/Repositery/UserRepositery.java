package com.example.Spring_base_project.Repositery;

import com.example.Spring_base_project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepositery extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.firstName LIKE %:param%")
    User findByFirstName(@Param("param") String param);

}
