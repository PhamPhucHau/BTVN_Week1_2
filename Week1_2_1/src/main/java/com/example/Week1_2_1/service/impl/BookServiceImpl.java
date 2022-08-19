package com.example.Week1_2_1.service.impl;

import com.example.Week1_2_1.Repository.BookRepository;
import com.example.Week1_2_1.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Week1_2_1.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getAllBooks()
    {
        return bookRepository.getAllBooks().stream().sorted(Comparator.comparing(Book::getYear).reversed()).collect(Collectors.toList());
    }
    @Override
    public Book getBookById(int id)
    {
           return  bookRepository.getBookById(id);
    }


}
