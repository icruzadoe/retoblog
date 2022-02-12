package com.tarea.blogs.services;

import com.tarea.blogs.enties.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author findById(Long id);
    Author findByName(String nombre);
    void save(Author author);
    void delete(Long id);
}
