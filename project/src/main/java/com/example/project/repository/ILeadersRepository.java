package com.example.project.repository;

import com.example.project.entity.Leaders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeadersRepository extends MongoRepository<Leaders, Long> {
}
