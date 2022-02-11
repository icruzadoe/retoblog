package com.tarea.blogs.services;

import com.tarea.blogs.enties.Comment;
import com.tarea.blogs.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl  implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return this.commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return this.commentRepository.findById(id).get();
    }

    @Override
    public List<Comment> findByName(String nombre) {
        return null;
    }

    @Override
    public Comment save(Comment comment) {
        if(comment.getPost().getStatus().equals("publicado")) {
            return this.commentRepository.save(comment);
        }

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
