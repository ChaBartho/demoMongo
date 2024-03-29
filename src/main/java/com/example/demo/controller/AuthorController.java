package com.example.demo.controller;

import com.example.demo.model.entities.Author;
import com.example.demo.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @PostMapping
    public String insert(@RequestBody Author author){
        return this.service.insert(author);
    }

    @GetMapping
    public List<Author> getAll(){
        return this.service.getAll();
    }

}
