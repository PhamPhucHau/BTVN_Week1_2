package com.example.Week1_2_1.controller;

import com.example.Week1_2_1.Model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Week1_2_1.service.BookService;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/book")
    public String ShowAllBooks(Model model)
    {
        List<Book> listBook=bookService.getAllBooks();
        model.addAttribute("listBooks",listBook);


        return "ListBook";

    }
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity <Book> getPersonById(@PathVariable("id") int id)
    {
        Book foundBook=bookService.getBookById(id);
        if(foundBook==null)
        {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundBook);
        }
    }

}
