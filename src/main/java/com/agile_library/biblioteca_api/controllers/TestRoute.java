package com.agile_library.biblioteca_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class TestRoute {
    @GetMapping("/books")
    public String test() {
        return "Olá mundo";
    }
}
