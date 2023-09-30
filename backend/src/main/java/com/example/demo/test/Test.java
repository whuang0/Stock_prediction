package com.example.demo.test;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table
public class Test {
    @Id
    @SequenceGenerator(name = "test_sequence", sequenceName = "test_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_sequence")
    private Long id;
    private String message;

    public Test(String message) {

    }

    public String getTest() {
        return message;
    }
}
