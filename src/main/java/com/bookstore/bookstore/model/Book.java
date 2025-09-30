/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.model;

import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author T590
 */
@Data
public class Book {
    
    private long id;
    private static int counter;
    private String title;
    private String author;
    private LocalDate dateBorrowed;
    private LocalDate returnDate;
    private int amount;

    public Book(String title, String author) {
        this.id = ++Book.counter;
        this.title = title;
        this.author = author;
        this.dateBorrowed = LocalDate.now();
        this.returnDate = LocalDate.now().plusDays(14);
    }
    
}
