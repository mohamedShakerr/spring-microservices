package com.microservices.limitservice.controller;

import com.microservices.limitservice.configuration.Configuration;
import com.microservices.limitservice.dto.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    private Configuration configuration;

    @Autowired
    public LimitConfigurationController(Configuration configuration){
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConiguration(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
