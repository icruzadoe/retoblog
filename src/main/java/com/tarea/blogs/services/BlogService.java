package com.tarea.blogs.services;

import com.tarea.blogs.enties.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    List<Blog> findByName(String nombre);
    Blog save(Blog blog);
    void delete(Long id);
}
