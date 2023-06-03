package com.example.Producer1.service;

import com.example.Producer1.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final KafkaTemplate<String, UserDto> kafkaTemplate;

    public void sendMessage(String to, UserDto msg) {
        kafkaTemplate.send(to, msg);
    }
}
