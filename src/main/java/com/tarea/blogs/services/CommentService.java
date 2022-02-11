package com.tarea.blogs.services;

import com.tarea.blogs.enties.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    Comment findById(Long id);
    List<Comment> findByName(String nombre);
    Comment save(Comment comment);
    void delete(Long id);
}
