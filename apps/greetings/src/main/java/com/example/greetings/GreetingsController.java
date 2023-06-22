package com.example.greetings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @Value("${GREETING_PREFIX:Hello}")
    private String greetingPrefix;

    @Value("${SECRET:}")
    private String secret;

    @Value("${HOSTNAME:}")
    private String hostName;

    @GetMapping("/greet")
    public String greet(String name) {
        return String.format("\n***\n%s> %s %s\n***\n\n", hostName, greetingPrefix, name);
    }

    @GetMapping("/secret")
    public String getSecret(String name) {
        return String.format("\n***\n%s> Secret is '%s'\n***\n\n", hostName, secret);
    }
}
