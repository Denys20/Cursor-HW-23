package com.example.Consumer3.service.impl;

import com.example.Consumer3.dto.NewsDto;
import com.example.Consumer3.dto.UserDto;
import com.example.Consumer3.entity.News;
import com.example.Consumer3.entity.Users;
import com.example.Consumer3.repository.NewsRepository;
import com.example.Consumer3.repository.UserRepository;
import com.example.Consumer3.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class ConsumerServiceImpl implements ConsumerService {
    private final UserRepository userRepository;
    private final NewsRepository newsRepository;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "user1", groupId = "3")
    public void consumerUser1(UserDto user1) {
        userRepository.save(modelMapper.map(user1, Users.class));
    }

    @KafkaListener(topics = "user2", groupId = "3")
    public void consumerUser2(UserDto user2) {
        userRepository.save(modelMapper.map(user2, Users.class));
    }

    @KafkaListener(topics = "news1", groupId = "3")
    public void consumerNews1(NewsDto news1) {
        newsRepository.save(modelMapper.map(news1, News.class));
    }

    @KafkaListener(topics = "news2", groupId = "3")
    public void consumerNews2(NewsDto news2) {
        newsRepository.save(modelMapper.map(news2, News.class));
    }
}