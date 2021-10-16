package com.example.project.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users")
@Getter @Setter
public class User {

    @Id
    private Long id;
    private String nickName;
    private String name;
    private String email;
    private String password;
    private String role;

    public User(Long id, String nickName, String name, String email, String password, String role) {
        this.id = id;
        this.nickName= nickName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {
    }
}
