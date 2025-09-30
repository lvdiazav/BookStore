/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author T590
 */
@Data
public class Member {
    
    private long id;
    private static int counter;
    private String name;
    private int age;
    private List<Book> borrowedBooks;

    public Member(String name, int age) {
        this.id = ++Member.counter;
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }
    
}
