package com.tarea.blogs.repositories;

import com.tarea.blogs.enties.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Long> {
    /*
    @Query("select count(b) from Blog b where b.author.id =  ?1")
    Integer findCount(Long id);

    @Query("select (b) from Blog b where b.author.id =  ?1")
    List<Blog> findAllBlogWithAuthor(Long id);

     */



}
