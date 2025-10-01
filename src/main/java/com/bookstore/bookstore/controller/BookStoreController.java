/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.model.Member;
import com.bookstore.bookstore.service.BookStoreService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T590
 */
@RestController
@RequestMapping("/bookstore")
public class BookStoreController {
    
    private static final Logger logger = LoggerFactory.getLogger(BookStoreController.class);
    
    @Autowired
    private BookStoreService service;
    
    @GetMapping("/books")
    public List<Book> getBooks() {
        logger.info("get books working appropriately");
        return service.getBooks();
    }
    
    @GetMapping("/members")
    public List<Member> getMembers() {
        logger.info("get members working appropriately");
        return service.getMembers();
    }
    
    @GetMapping("/borrowed-books")
    public List<Book> getBorrowedBooks() {
        logger.info("get borrowed books working appropiately");
        return service.getBorrowedBooks();
    }
    
    @PostMapping("/add/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        service.addBook(book);
        logger.info("adding book working appropiately, adding " + book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
    
    @PostMapping("/add/member")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        if (service.addMember(member)) {
            logger.info("adding member working appropiately");
            return new ResponseEntity<>(member, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }
    
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable long id) {
        Book book = service.findBookById(id);
        if (book != null) {
            logger.info("Book found by id");
            return new ResponseEntity<>(book, HttpStatus.FOUND);
        } else {
            logger.info("Book did not find");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
