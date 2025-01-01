package com.example.deploy_v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${api.test}")
    private String test;
    @GetMapping("")
    public String hello() {
        return "TEST: " + test;
    }
}
