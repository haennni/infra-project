package org.example.infrapractice.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String home() {
        return "자동 배포화 성공 테스트입니다.";
    }

}
