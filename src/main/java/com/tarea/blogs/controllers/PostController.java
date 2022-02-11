package com.tarea.blogs.controllers;

import com.tarea.blogs.enties.Blog;
import com.tarea.blogs.enties.Post;
import com.tarea.blogs.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public Post save(@RequestBody Post post){
        return this.postService.save(post);
    }

    @GetMapping
    public List<Post> findAll(){
        System.out.println("call findALl");
        return this.postService.findAll();
    }

}
