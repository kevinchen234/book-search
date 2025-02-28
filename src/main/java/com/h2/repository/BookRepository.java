/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.h2.entity.Book;

/**
 *
 * @author kevinchen
 */
public interface BookRepository extends JpaRepository<Book, Long> {

  @Query(value = "SELECT * FROM books WHERE search_vector @@ to_tsquery(:searchTerm)", nativeQuery = true)
  List<Book> searchBooks(@Param("searchTerm") String searchTerm);
}
