package com.example.Consumer3.repository;

import com.example.Consumer3.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}

