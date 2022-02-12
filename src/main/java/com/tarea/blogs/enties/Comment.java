package com.tarea.blogs.enties;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;
    @Getter @Setter
    private Date date;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String comment;
    @Getter @Setter
    private Long id_post;


}
