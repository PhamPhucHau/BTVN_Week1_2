package com.example.Week1_2_1.Repository;

import com.example.Week1_2_1.Model.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Repository
public class BookRepository {
    private ArrayList<Book> listBooks;
    @PostConstruct
    public void InitBookRepository()
    {
        listBooks=new ArrayList<Book>();
        listBooks.add(new Book(1,"Gone with the wind","Margaret Mitchell",1936));
        listBooks.add(new Book(2,"Thinking fast and slow","Daniel Kahneman",2011 ));
        listBooks.add(new Book(3,"Nobody's boy","Hector Malot",1878));
        listBooks.add(new Book(4,"Think and Grow rich","Nopoleon Hill",1937));
        listBooks.add(new Book(5,"Who moved my cheese","Dr Spencer Jonhson",2017));
    }
    public ArrayList<Book> getAllBooks()
    {
        return listBooks;
    }
    public Book getBookById(int id)
    {
        Book tempBook=null;
        for (Book book:listBooks) {
            if( book.getId()==id)
                tempBook= book;
        }
        return tempBook;
    }
}
