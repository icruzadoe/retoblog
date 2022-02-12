package com.tarea.blogs.repositories;

import com.tarea.blogs.enties.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>{

    @Query("select count(a) from Author a  where a.id =  ?1")
    Integer findCount(Long id);

    @Query("select (a) from Author a where a.id =  ?1")
    Author findAuthorBlog(Long id);

    @Query("select (a) from Author a where a.name =  ?1")
    Author findByName(String name);
}
