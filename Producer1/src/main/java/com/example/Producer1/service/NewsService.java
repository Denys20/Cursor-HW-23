package com.example.Producer1.service;

import com.example.Producer1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final KafkaTemplate<String, NewsDto> kafkaTemplate;

    public void sendMessage(String to, NewsDto msg) {
        kafkaTemplate.send(to, msg);
    }
}
