package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping("/")
    public List<City> getCities() {
        return cityRepository.findAll();
    }
}
