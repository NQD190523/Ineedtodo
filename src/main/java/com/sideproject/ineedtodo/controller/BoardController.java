package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.model.Board;
import com.sideproject.ineedtodo.service.BoardService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class BoardController {

    private BoardService boardService;

    @PostMapping("/board")
    public Board postBoard(@RequestBody Board board) {
        return boardService.addBoard(board);
    }
    
}
