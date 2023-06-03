package com.example.Producer1.web;

import com.example.Producer1.dto.NewsDto;
import com.example.Producer1.dto.UserDto;
import com.example.Producer1.service.NewsService;
import com.example.Producer1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/producer")
public class ProducerController {
    private final UserService userService;
    private final NewsService newsService;

    @PostMapping("/user")
    public void sendUser(@RequestParam String topic, @RequestBody UserDto user) {
        userService.sendMessage(topic, user);
    }

    @PostMapping("/news")
    public void sendNews(@RequestParam String topic, @RequestBody NewsDto news) {
        newsService.sendMessage(topic, news);
    }
}
