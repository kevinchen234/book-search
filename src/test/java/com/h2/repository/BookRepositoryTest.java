package com.h2.repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.h2.entity.Book;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BookRepositoryTest {

  @Autowired
  private BookRepository bookRepository;

  @Test
  void testSearchBooks() {
    List<Book> books = bookRepository.searchBooks("algorithms");
    assertTrue(!books.isEmpty());

    // for (Book book : books) {
    //   System.out.println(">>> Book Title: " + book.getTitle());
    // }
  }
}
