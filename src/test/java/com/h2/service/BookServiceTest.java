package com.h2.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTest {

  @Autowired
  private BookService bookService;

  @Test
  void testSearchBooksWhenTermIsEmpty() {
    String searchTerm = "";
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> bookService.searchBooks(searchTerm));
    assertNotNull(exception);
  }

  @Test
  void testSearchBooksWhenTermIsNull() {
    String searchTerm = null;
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> bookService.searchBooks(searchTerm));
    assertNotNull(exception);
  }

  @Test
  void testSearchBooksWhenTermIsValid() {
    String searchTerm = "algorithms";
    assertFalse(bookService.searchBooks(searchTerm).isEmpty());
  }
}
