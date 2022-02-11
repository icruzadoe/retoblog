package com.tarea.blogs.enties;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;
    @Getter @Setter
    private String tittle;
    @Getter @Setter
    private Date date;
    @Getter @Setter
    private String status;
    @Getter @Setter
    private String content;
    /*
    @Getter @Setter
    @ManyToOne()
    @JoinColumn(name = "author_id")
    private Author author;
    */
}
