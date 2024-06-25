package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.model.BoardDetail;
import com.sideproject.ineedtodo.service.BoardService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class BoardController {

    private BoardService boardService;

    @GetMapping("/board")
    public String getBoard() {
        return "hello world";
    }
    

    @PostMapping("/board")
    public BoardDetail postBoard(@RequestBody BoardDetail board) {
        return boardService.addBoard(board);
    }
    
}
