package com.tarea.blogs.enties;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "blog")
public class Blog {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String url;
    @Getter @Setter
    private String status;
    @Getter @Setter
    private String message;
    @Getter @Setter
    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> posts;
    @Getter @Setter
    private Long id_author;

}
