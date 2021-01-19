package com.things.swagger.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
@Api(value = "/house", tags = "회원 거주지", description = "회원의 거주지 CRUD")
public class HouseController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getHouse() {
        return "Your House";
    }
}
