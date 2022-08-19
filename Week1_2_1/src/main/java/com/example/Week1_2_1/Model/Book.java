package com.example.Week1_2_1.Model;
public class Book {
    int id;
    String name;
    String author;
    int year;
    public Book(int id,String name, String author, int year)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.year=year;
    };
    public int getYear()
    {
        return this.year;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }

}
