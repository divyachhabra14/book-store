package com.bookstore.service;

import com.bookstore.model.Book;
import com.bookstore.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookService {

    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookid) {
        bookRepository.deleteById(bookid);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

