package com.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.h2.entity.Book;


/**
 *
 * @author kevinchen
 */
@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/search")
  public List<Book> searchBooks(@RequestParam String searchTerm) {
      return bookService.searchBooks(searchTerm);
  }

}
