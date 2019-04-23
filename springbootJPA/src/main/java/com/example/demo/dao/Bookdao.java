package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Book;

public interface Bookdao extends CrudRepository<Book, Long>{

List <Book> findByTitle(String Title);
}
