package com.lou.lou_service.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExperimentServiceTest {
@Autowired
    ExperimentService experimentService;
    @Test
    void findAll(){
        System.out.println(experimentService.getById(2));
    }
}