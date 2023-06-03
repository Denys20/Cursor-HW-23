package com.example.Consumer3.repository;

import com.example.Consumer3.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
