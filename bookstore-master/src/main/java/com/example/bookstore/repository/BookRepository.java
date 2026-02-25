package com.example.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorName(String name);

    List<Book> findByPublisherName(String publisherName);

    List<Book> findByTitleContaining(String keyword);
}
