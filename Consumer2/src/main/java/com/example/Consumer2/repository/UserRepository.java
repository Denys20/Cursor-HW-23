package com.example.Consumer2.repository;

import com.example.Consumer2.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}

