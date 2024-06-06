package com.sideproject.ineedtodo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.sideproject.ineedtodo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User  findByName(String name);
    User findByEmail(String email);
}
