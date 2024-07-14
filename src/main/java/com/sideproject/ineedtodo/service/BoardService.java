package com.sideproject.ineedtodo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

    public List<BoardDetail> getBoards(String id) {
        return boardRepository.findByMemberIdOrBoardCreatorId(id);
    }

    public void updateBoard(String id, BoardDetail board) {
        boardRepository.findById(id).map(existBoard -> {
            existBoard.setActivityLog(board.getActivityLog());
            existBoard.setName(board.getName());
            existBoard.setDescription(board.getDescription());
            existBoard.setMembers(board.getMembers());
            existBoard.setGroup(board.getGroup());
            return boardRepository.save(existBoard);
        });
    }

    public void deletedBoard(String id){
        boardRepository.deleteById(id);
    }
}
