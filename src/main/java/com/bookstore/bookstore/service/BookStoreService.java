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

    public BookStoreService() {
        books.add(new Book("Pana", "Vinicio"));
        books.add(new Book("Perro", "Panardo"));
        members.add(new Member("Vinicio", 18));
        members.add(new Member("Fausto", 16));
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
        boolean bookExist = false;
        for (Book b : BookStoreService.books) {
            if (b.equals(book)) {
                bookExist = true;
                b.setAmount(b.getAmount() + 1);
                break;
            }
        }
        if (!bookExist) {
            BookStoreService.books.add(book);
        }
    }
    
    public boolean addMember(Member member) {
        boolean memberExist = false;
        for (Member m : BookStoreService.members) {
            if (m.equals(member)) {
               memberExist = true; 
            }
        }
        if (member.getAge() < 10 || memberExist) {
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
