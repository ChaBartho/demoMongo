package com.example.demo.service;

import com.example.demo.model.entities.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository repository;
    public AuthorService(AuthorRepository repository){
        this.repository = repository;
    }
    public String insert(Author author){
        author.setBooks(new ArrayList<>());
        Author entity = this.repository.save(author);
        return entity.getId();
    }

    public List<Author> getAll(){
        return this.repository.findAll();
    }
}