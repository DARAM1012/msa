package com.pmh.ex09.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    //select * from where email = ?
    Optional<User> findByEmail(String emaul);
}
