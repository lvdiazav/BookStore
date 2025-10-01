/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.age;
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
        final Member other = (Member) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}
