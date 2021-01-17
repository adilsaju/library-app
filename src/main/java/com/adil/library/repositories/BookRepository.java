package com.adil.library.repositories;

import java.util.List;

import com.adil.library.model.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository 
    extends CrudRepository<Book, 
                           Integer> { 
  
    Book findById(int id); 
    List<Book> findAll(); 
    void deleteById(int id); 
} 