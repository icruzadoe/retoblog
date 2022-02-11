package com.tarea.blogs.services;

import com.tarea.blogs.enties.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author findById(Long id);
    List<Author> findByName(String nombre);
    Author save(Author author);
    void delete(Long id);
}
