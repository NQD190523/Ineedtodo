package com.sideproject.ineedtodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sideproject.ineedtodo.model.Board;
import com.sideproject.ineedtodo.repository.BoardRepository;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public Board  addBoard(Board board) {
        return boardRepository.save(board);
    }
}
