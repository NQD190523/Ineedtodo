package com.sideproject.ineedtodo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sideproject.ineedtodo.model.Board;

@Repository
public interface BoardRepository extends MongoRepository<Board, String> {

}