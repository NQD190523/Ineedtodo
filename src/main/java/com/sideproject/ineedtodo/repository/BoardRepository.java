package com.sideproject.ineedtodo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sideproject.ineedtodo.model.BoardDetail;

@Repository
public interface BoardRepository extends MongoRepository<BoardDetail, String> {

}
