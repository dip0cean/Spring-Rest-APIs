package com.things.swagger.config;

import com.things.swagger.repository.PersonRepository;
import com.things.swagger.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final PersonRepository repository;

    @Autowired
    public SpringConfig(PersonRepository repository) {
        this.repository = repository;
    }

    @Bean
    public PersonService PersonService() {
        return new PersonService(repository);
    }
}
