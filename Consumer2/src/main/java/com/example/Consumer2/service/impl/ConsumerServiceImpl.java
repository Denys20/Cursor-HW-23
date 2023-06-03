package com.example.Consumer2.service.impl;

import com.example.Consumer2.dto.NewsDto;
import com.example.Consumer2.dto.UserDto;
import com.example.Consumer2.entity.News;
import com.example.Consumer2.entity.Users;
import com.example.Consumer2.repository.NewsRepository;
import com.example.Consumer2.repository.UserRepository;
import com.example.Consumer2.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerServiceImpl implements ConsumerService {
    private final UserRepository userRepository;
    private final NewsRepository newsRepository;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "user1", groupId = "2")
    public void consumerUser1(UserDto user1) {
        userRepository.save(modelMapper.map(user1, Users.class));
    }

    @KafkaListener(topics = "user2", groupId = "2")
    public void consumerUser2(UserDto user2) {
        userRepository.save(modelMapper.map(user2, Users.class));
    }

    @KafkaListener(topics = "news1", groupId = "2")
    public void consumerNews1(NewsDto news1) {
        newsRepository.save(modelMapper.map(news1, News.class));
    }

    @KafkaListener(topics = "news2", groupId = "2")
    public void consumerNews2(NewsDto news2) {
        newsRepository.save(modelMapper.map(news2, News.class));
    }
}
