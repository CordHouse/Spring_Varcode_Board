package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public List<Board> getBoards(){
        return boardRepository.findAll();
    }

    @Transactional
    public Board getBoard(Long id){
        return boardRepository.findById(id).get();
    }

    @Transactional
    public Board putBoard(Board board){
        return boardRepository.save(board);
    }

    @Transactional
    public Board changeBoard(Long id, Board board){
        Board beforeBoard = boardRepository.findById(id).get();
        beforeBoard.setTitle(board.getTitle());
        beforeBoard.setContent(board.getContent());
        return beforeBoard;
    }

    @Transactional
    public void deleteBoard(Long id){
        boardRepository.deleteById(id);
    }
}
