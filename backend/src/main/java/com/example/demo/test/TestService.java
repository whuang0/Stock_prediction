package com.example.demo.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public String getMessage() {
        Optional<Test> testOptional = testRepository.findById((long) 1);
        if (testOptional.isPresent()) {
            return testOptional.get().getMessage();
        }
        return "Error getting record";
    }

}
