package org.example.spring_rest_book.repository;

import org.example.spring_rest_book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}