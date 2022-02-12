package com.tarea.blogs.services;

import com.tarea.blogs.enties.Blog;
import com.tarea.blogs.repositories.AuthorRepository;
import com.tarea.blogs.repositories.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogRespository blogRespository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorService authorService;

    @Override
    public List<Blog> findAll() {
        return this.blogRespository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return this.blogRespository.findById(id).get();
    }

    @Override
    public List<Blog> findByName(String nombre) {
        return null;
    }

    @Override
    public Blog save(Blog blog) {
        var blogActual = new Blog();
        var authorActual = this.authorService.findById(blog.getId_author());

        if(this.authorRepository.findCount(blog.getId()) == 2){
            blogActual.setMessage("Cuenta con el maximo de blogs");
            return blogActual;
        }else if(this.authorRepository.findAuthorBlog(blog.getId_author()).getAge() < 18){
            blogActual.setMessage("Tienes que tener mas de 18 años para publicar un blog");
            return blogActual;
        }

        blog.setStatus("activo");
        blogActual = this.blogRespository.save(blog);
        var blogs = authorActual.getBlogs();
        blogs.add(blogActual);
        authorActual.setBlogs(blogs);
        this.authorService.save(authorActual);
        return blogActual;
    }

    @Override
    public void update(Blog blog) {
        this.blogRespository.save(blog);
    }

    @Override
    public void delete(Long id) {

    }
}
