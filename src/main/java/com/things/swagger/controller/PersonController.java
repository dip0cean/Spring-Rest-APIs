package com.things.swagger.controller;

import com.things.swagger.domain.Person;
import com.things.swagger.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public Person findByPerson(@PathVariable("id") String id) {
        return personService.findByAll(id);

    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }
}
