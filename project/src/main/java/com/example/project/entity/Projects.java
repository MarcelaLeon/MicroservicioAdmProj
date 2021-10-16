package com.example.project.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;


@Document(collection = "projects")
@Getter
@Setter
public class Projects {

    @Id
    private Long id;
    private String name;
    private String description;
    private int budget;
    private String dinit;
    private String dfin;

    @Field(name = "leader")
    private Leaders leader;

    @Field(name = "students_list")
    private Students[] students;

    private Boolean active;
    private String status;
    private String[] advances;


    public Projects(String name, String description, int budget, String dinit, String dfin, Leaders leader, Students[] students, Boolean active, String status, String[] advances) {
        this.name = name;
        this.description = description;
        this.budget = budget;
        this.dinit = dinit;
        this.dfin = dfin;
        this.leader = leader;
        this.students = students;
        this.active = active;
        this.status = status;
        this.advances = advances;
    }

    public Projects() {
    }

}
