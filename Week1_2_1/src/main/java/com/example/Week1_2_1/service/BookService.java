package com.example.Week1_2_1.service;

import com.example.Week1_2_1.Model.Book;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(int id);
}
