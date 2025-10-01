/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.model;

import java.util.Objects;
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
    private int amount;

    public Book(String title, String author) {
        this.id = ++Book.counter;
        this.title = title;
        this.author = author;
        this.amount = 1;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }

    
}
