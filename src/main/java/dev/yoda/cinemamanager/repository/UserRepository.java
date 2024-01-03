package dev.yoda.cinemamanager.repository;

import dev.yoda.cinemamanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Fetch all users
    List<User> findAll();
    // Fetch the user by ID
    User findById(@Param("id") long id);
    // Fetch the user by Email
    User findByEmail(@Param("email") String email);

}
