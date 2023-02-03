package com.example.demo.service;

import com.example.demo.model.entities.Author;
import com.example.demo.model.entities.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository repository, AuthorRepository authorRepository) {
        this.repository = repository;
        this.authorRepository = authorRepository;
    }

    public String insert(Book book, String idAuthor){
        Book entity = this.repository.save(book);
        Author author = this.authorRepository.findById(idAuthor).orElseThrow();
        author.getBooks().add(entity);
        this.authorRepository.save(author);
        return entity.getId();
    }

}
