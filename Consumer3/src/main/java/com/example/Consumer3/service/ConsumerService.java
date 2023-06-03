package com.example.Consumer3.service;

import com.example.Consumer3.dto.NewsDto;
import com.example.Consumer3.dto.UserDto;

public interface ConsumerService {
    void consumerUser1(UserDto user1);
    void consumerUser2(UserDto user2);
    void consumerNews1(NewsDto news1);
    void consumerNews2(NewsDto news2);
}
