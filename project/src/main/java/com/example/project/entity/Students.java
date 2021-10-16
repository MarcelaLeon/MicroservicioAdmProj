package com.example.project.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Getter
@Setter
public class Students {

    @Id
    private Long id;
    private String name;
    private Long movil;
    private String email;
    private String time;

    public Students(String name, Long movil, String email, String time) {
        this.name = name;
        this.movil = movil;
        this.email = email;
        this.time = time;
    }

    public Students() {
    }
}
