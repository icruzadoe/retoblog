package com.tarea.blogs.services;

import com.tarea.blogs.enties.Post;
import com.tarea.blogs.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return this.postRepository.findById(id).get();
    }

    @Override
    public List<Post> findByName(String nombre) {
        return null;
    }

    @Override
    public Post save(Post post) {

        if(post.getBlog().getStatus().equals("activo")){
            post.setDate(this.getDate());
            post.setStatus("publicado");
            return this.postRepository.save(post);
        }

        return null;
    }

    @Override
    public void delete(Long id) {

    }

    public Date getDate(){
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        System.out.println("+++++++++++++");
        System.out.println(date);
        System.out.println("+++++++++++++");
        return date;
    }
}
