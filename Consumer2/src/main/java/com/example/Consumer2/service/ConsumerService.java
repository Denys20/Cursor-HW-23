package com.example.Consumer2.service;

import com.example.Consumer2.dto.NewsDto;
import com.example.Consumer2.dto.UserDto;

public interface ConsumerService {
    void consumerUser1(UserDto user1);
    void consumerUser2(UserDto user2);
    void consumerNews1(NewsDto news1);
    void consumerNews2(NewsDto news2);
}
