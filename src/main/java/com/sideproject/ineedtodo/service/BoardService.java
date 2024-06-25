package com.sideproject.ineedtodo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.sideproject.ineedtodo.model.BoardDetail;
import com.sideproject.ineedtodo.repository.BoardRepository;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public BoardDetail  addBoard(BoardDetail board) {
        return boardRepository.save(board);
    }

    // public List<Board> getBoards(String userName) {
    //     return boardRepository.findAll(Example.of(new Board().setBoardCreator(userName).setMembers(userName)));
    // }
}
