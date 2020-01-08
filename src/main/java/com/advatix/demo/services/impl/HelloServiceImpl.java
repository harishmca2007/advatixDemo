package com.advatix.demo.services.impl;

import com.advatix.demo.repository.HelloRepository;
import com.advatix.demo.services.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    HelloRepository helloRepository;

    @Override
    public String get() {
        return helloRepository.get();
    }

}
