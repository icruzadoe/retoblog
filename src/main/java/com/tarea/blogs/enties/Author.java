package com.tarea.blogs.enties;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="author")
public class Author {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String phone;
    @Getter @Setter
    private Integer age;
    @Getter @Setter
    @OneToMany(cascade = CascadeType.ALL)
    private List<Blog> blogs;

}
