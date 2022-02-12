package com.tarea.blogs.controllers;

import com.tarea.blogs.enties.Author;
import com.tarea.blogs.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public void save(@RequestBody Author author){
         this.authorService.save(author);
    }

    @GetMapping
    public List<Author> findAll(){
        System.out.println("call findALl");
        return this.authorService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        this.authorService.delete(id);
    }
}
