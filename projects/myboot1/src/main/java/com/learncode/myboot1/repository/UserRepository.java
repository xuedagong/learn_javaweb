package com.learncode.myboot1.repository;

import com.learncode.myboot1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
