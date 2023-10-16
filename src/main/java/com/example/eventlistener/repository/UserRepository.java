package com.example.eventlistener.repository;

import com.example.eventlistener.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<User,Long> {


    @Query("SELECT u from User as u where u.email = :email")
    public Optional<User> findByEmail(String email);

}
