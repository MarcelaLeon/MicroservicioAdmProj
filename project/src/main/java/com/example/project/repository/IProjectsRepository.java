package com.example.project.repository;

import com.example.project.entity.Leaders;
import com.example.project.entity.Projects;
import com.example.project.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProjectsRepository extends MongoRepository<Projects, Long> {

    User findByLeaderName(Leaders leaders, String name);

}
