package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.model.BoardDetail;
import com.sideproject.ineedtodo.service.BoardService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/{id}")
    public List<BoardDetail> getBoard(String id) {
        return boardService.getBoards(id);
    }
    
    @PostMapping("/board")
    public BoardDetail postBoard(@RequestBody BoardDetail board) {
        return boardService.addBoard(board);
    }
    
}
