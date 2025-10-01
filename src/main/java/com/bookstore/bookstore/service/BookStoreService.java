/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.service;

import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.model.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public BookStoreService() {
        books.add(new Book("Pana", "Vinicio"));
        members.add(new Member("Vinicio", 18));
    }
    
    public List<Book> getBooks() {
        return BookStoreService.books;
    }
    
    public List<Member> getMembers() {
        return BookStoreService.members;
    }
    
    public List<Book> getBorrowedBooks() {
        return BookStoreService.borrowedBooks;
    }
    
    public void addBook(Book book) {
        BookStoreService.books.add(book);
    }
    
    public boolean addMember(Member member) {
        if (member.getAge() < 10) {
            return false;
        } else {
            BookStoreService.members.add(member);
            return true;
        }
    }
    
    public Book findBookById(long id) {
        Book b = null;
        for (Book book : BookStoreService.books) {
            if (book.getId() == id) {
                b = book;
            }
        }
        return b;
    }
    
    public Member findMemberById(long id) {
        Member m = null;
        for (Member member : BookStoreService.members) {
            if (member.getId() == id) {
                m = member;
            }
        }
        return m;
    }
}
