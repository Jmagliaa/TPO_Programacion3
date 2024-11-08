package com.edutec.demoneo4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }

}