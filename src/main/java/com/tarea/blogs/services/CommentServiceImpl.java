package com.tarea.blogs.services;

import com.tarea.blogs.enties.Comment;
import com.tarea.blogs.enties.Post;
import com.tarea.blogs.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl  implements CommentService{

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostService postService;

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
        var commentActual = new Comment();
        var postActual = this.postService.findById(comment.getId_post());

        if(postActual.getStatus().equals("publicado")) {
            commentActual = this.commentRepository.save(comment);
            var comments = postActual.getComments();
            comments.add(commentActual);
            postActual.setComments(comments);
            this.postService.update(postActual);
            return commentActual;
        }

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
