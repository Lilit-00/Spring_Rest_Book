package org.example.spring_rest_book.repository;


import org.example.spring_rest_book.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Optional<Author> findByEmail(String email);
}