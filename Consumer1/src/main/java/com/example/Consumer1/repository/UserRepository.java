package com.example.Consumer1.repository;

import com.example.Consumer1.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
