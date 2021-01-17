package com.things.swagger.controller;

import com.things.swagger.domain.Person;
import com.things.swagger.service.PersonService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@Api(value = "/person", description = "Person 객체에 대한 CRUD")
@RequiredArgsConstructor
@RepositoryRestController
public class PersonController {

    private final PersonService personService;

    @ApiOperation(value = "회원 검색", nickname = "회원 검색")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiImplicitParam(name = "id", dataType = "string", paramType = "query", value = "회원 고유번호")
    @ApiResponses({
            @ApiResponse(code = 200, message = "회원 조회 성공"),
            @ApiResponse(code = 401, message = "회원 조회 실패", response = Person.class)
    })
    public Person findByPerson(@PathVariable("id") String id) {
        return personService.findByAll(id);

    }

    @ApiOperation(value = "회원 등록", nickname = "회원 등록")
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }
}
