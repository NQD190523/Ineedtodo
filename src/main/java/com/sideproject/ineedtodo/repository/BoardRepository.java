package com.sideproject.ineedtodo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sideproject.ineedtodo.model.BoardDetail;

@Repository
public interface BoardRepository extends MongoRepository<BoardDetail, String> {
    @Query("{$or : [ {'members.id' : ?0}, {'boardCreator.id': ?0}]}")
    List<BoardDetail> findByUserId(String id);

}
