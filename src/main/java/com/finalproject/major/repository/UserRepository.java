package com.finalproject.major.repository;

import com.finalproject.major.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
   Optional<User> findUserByEmail(String email);
}
