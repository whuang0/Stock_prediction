package com.example.demo.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public String getTest() {
        return "Hello World";
    }

}
