package com.example.Consumer1.repository;

import com.example.Consumer1.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
