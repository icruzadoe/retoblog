package com.tarea.blogs.repositories;

import com.tarea.blogs.enties.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Long> {
}
