package com.tarea.blogs.services;

import com.tarea.blogs.enties.Blog;
import com.tarea.blogs.repositories.AuthorRepository;
import com.tarea.blogs.repositories.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogRespository blogRespository;

    @Autowired
    private AuthorRepository authorRepository;

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
        var  blogActual = new Blog();

        if(this.blogRespository.findCount(blog.getAuthor().getId()) == 2){
            blogActual.setMessage("Cuenta con el maximo de blogs");
            return blogActual;
        }else if(blog.getAuthor().getAge() < 18){
            blogActual.setMessage("Tienes que tener mas de 18 años para publicar un blog");
            return blogActual;
        }

        blog.setStatus("activo");
        return this.blogRespository.save(blog);
    }

    @Override
    public void delete(Long id) {

    }
}
