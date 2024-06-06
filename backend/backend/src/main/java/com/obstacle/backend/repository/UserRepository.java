package com.obstacle.backend.repository;


import com.obstacle.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.obstacle.backend.repository")

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
