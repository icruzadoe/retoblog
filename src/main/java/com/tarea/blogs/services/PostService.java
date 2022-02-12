package com.tarea.blogs.services;

import com.tarea.blogs.enties.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    Post findById(Long id);
    List<Post> findByName(String nombre);
    Post save(Post post);
    void update(Post post);
    void delete(Long id);
}
