package org.example.infrapractice.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String home() {
        return "Docker 컨테이너 기반 CI/CD 서버 배포하기";
    }

}
