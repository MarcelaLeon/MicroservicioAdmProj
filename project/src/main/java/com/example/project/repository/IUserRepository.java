package com.example.project.repository;

import com.example.project.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends MongoRepository<User, Long> {

    User findByNickName(String nickName);
    List<User> findAllByEmail(String email);
}
