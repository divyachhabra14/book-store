package com.bookstore.service;

import com.bookstore.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long bookid);

    List<Book> findAllBooks();
}
