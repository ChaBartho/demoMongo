package com.example.demo.service;

import com.example.demo.model.entities.Book;
import com.example.demo.model.entities.Librairie;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibrairieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrairieService {

    private final LibrairieRepository repository;
    private final BookRepository bookRepository;

    public LibrairieService(LibrairieRepository repository, BookRepository bookRepository) {
        this.repository = repository;
        this.bookRepository = bookRepository;
    }

    public String insert(Librairie librairie){
        Librairie entity = this.repository.save(librairie);
        return entity.getId();
    }

    public List<Librairie> getAll(){
        return this.repository.findAll();
    }

}
