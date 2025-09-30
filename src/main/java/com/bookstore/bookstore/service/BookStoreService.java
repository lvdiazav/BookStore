/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.service;

import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.model.Member;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author T590
 */
@Service
public class BookStoreService {
    
    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static List<Book> borrowedBooks = new ArrayList<>();
    
    public List<Book> getBooks() {
        return BookStoreService.books;
    }
    
    public List<Member> getMembers() {
        return BookStoreService.members;
    }
    
    public List<Book> getBorrowedBooks() {
        return BookStoreService.borrowedBooks;
    }
}
