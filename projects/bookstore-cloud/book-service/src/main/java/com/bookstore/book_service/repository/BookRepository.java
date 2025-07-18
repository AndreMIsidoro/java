package com.bookstore.book_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.book_service.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
}
