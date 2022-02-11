package com.tarea.blogs.controllers;

import com.tarea.blogs.enties.Author;
import com.tarea.blogs.enties.Blog;
import com.tarea.blogs.services.AuthorService;
import com.tarea.blogs.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping
    public Blog save(@RequestBody Blog blog){
        return this.blogService.save(blog);
    }

    @GetMapping
    public List<Blog> findAll(){
        System.out.println("call findALl");
        return this.blogService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        this.blogService.delete(id);
    }
}
