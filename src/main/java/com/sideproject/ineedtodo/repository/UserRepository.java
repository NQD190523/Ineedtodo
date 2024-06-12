package com.sideproject.ineedtodo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.sideproject.ineedtodo.model.User;
import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByFullName(String fullName);
    User findByEmail(String email);
}
