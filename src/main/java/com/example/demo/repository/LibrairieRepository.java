package com.example.demo.repository;

import com.example.demo.model.entities.Librairie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibrairieRepository extends MongoRepository<Librairie, String> {
}
