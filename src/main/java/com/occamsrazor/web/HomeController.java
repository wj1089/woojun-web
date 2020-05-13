package com.occamsrazor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
        @GetMapping("/")
        public String home() {
            return "안녕 그래들! 더럽게 어렵겠지만 잘해보자!!";
        }
}