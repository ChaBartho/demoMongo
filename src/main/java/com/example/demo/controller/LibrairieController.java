package com.example.demo.controller;

import com.example.demo.model.entities.Librairie;
import com.example.demo.service.LibrairieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librairie")
public class LibrairieController {
    private final LibrairieService service;

    public LibrairieController(LibrairieService service) {
        this.service = service;
    }

    @PostMapping
    public String insert(@RequestBody Librairie librairie){
        return this.service.insert(librairie);
    }

    @GetMapping
    public List<Librairie> getAll(){
        return this.service.getAll();
    }
}
