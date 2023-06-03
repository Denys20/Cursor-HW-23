package com.example.Consumer2.repository;

import com.example.Consumer2.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
