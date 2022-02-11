package com.tarea.blogs.controllers;

import com.tarea.blogs.enties.Comment;
import com.tarea.blogs.enties.Post;
import com.tarea.blogs.services.CommentService;
import com.tarea.blogs.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment save(@RequestBody Comment comment){
        return this.commentService.save(comment);
    }

    @GetMapping
    public List<Comment> findAll(){
        System.out.println("call findALl");
        return this.commentService.findAll();
    }

}
