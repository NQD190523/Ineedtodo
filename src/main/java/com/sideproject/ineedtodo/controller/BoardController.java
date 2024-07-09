package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.model.BoardDetail;
import com.sideproject.ineedtodo.service.BoardService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/{id}")
    public List<BoardDetail> getBoard(@PathVariable String id) {
        return boardService.getBoards(id);
    }
    
    @PostMapping("/board")
    public BoardDetail postBoard(@RequestBody BoardDetail board) {
        return boardService.addBoard(board);
    }

    @PutMapping("board/{id}")
    public void updateBoard(@PathVariable String id, @RequestBody BoardDetail boardDetail) {
        boardService.updateBoard(id, boardDetail);
    }

    @DeleteMapping("/board/{id}")
    public void deleteBoard(@PathVariable String id) {
        boardService.deletedBoard(id);
    }
    
}
