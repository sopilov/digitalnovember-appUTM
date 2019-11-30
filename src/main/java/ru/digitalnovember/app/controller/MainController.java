package ru.digitalnovember.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalnovember.app.service.TestService;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final TestService testService;

    @GetMapping("/")
    public String healthCheck() {
        return "Hello, I`m alive, suka" + testService.getAll();
    }
}
