package com.advatix.demo.repository.impl;

import org.springframework.stereotype.Repository;

import com.advatix.demo.repository.HelloRepository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
    @Override
    public String get() {
        return "Hello Advatix Demo JUnit 5";
    }
}
