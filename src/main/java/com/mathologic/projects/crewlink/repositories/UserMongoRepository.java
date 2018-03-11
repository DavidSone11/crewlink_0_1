package com.mathologic.projects.crewlink.repositories;

import com.mathologic.projects.crewlink.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<Users, Integer> {
    Users findByName(String name);
}
