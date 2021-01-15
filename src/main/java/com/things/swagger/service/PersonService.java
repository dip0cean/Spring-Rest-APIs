package com.things.swagger.service;

import com.things.swagger.domain.Person;
import com.things.swagger.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person findByAll(String id) {
        return repository.findById(id).get();
    }

    public Person save(Person person) {
        return repository.save(person);
    }

}
