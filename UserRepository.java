package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
