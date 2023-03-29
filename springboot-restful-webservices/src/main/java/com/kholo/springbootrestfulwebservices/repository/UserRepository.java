package com.kholo.springbootrestfulwebservices.repository;

import com.kholo.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
