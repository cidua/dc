package com.datacart.mvc.service;

import com.datacart.mvc.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
