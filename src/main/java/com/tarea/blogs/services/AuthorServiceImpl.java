package com.tarea.blogs.services;

import com.tarea.blogs.enties.Author;
import com.tarea.blogs.repositories.AuthorRepository;
import com.tarea.blogs.repositories.BlogRespository;
import com.tarea.blogs.repositories.CommentRepository;
import com.tarea.blogs.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BlogRespository blogRespository;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author findById(Long id) {
        return this.authorRepository.findById(id).get();
    }

    @Override
    public List<Author> findByName(String nombre) {
        return null;
    }

    @Override
    public Author save(Author author) {
        return this.authorRepository.save(author);
    }

    @Override
    public void delete(Long id) {

        this.authorRepository.deleteById(id);
    }
}
