package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/api/board")
    public ResponseEntity<?> getBoards(){
        return new ResponseEntity<>(boardService.getBoards(), HttpStatus.OK);
    }

    @GetMapping("/api/board/{id}")
    public ResponseEntity<?> getBoard(@PathVariable("id") Long id){
        return new ResponseEntity<>(boardService.getBoard(id), HttpStatus.OK);
    }

    @PostMapping("/api/board")
    public ResponseEntity<?> putBoard(@RequestBody Board board){
        return new ResponseEntity<>(boardService.putBoard(board), HttpStatus.CREATED);
    }

    @PutMapping("/api/board/{id}")
    public ResponseEntity<?> changeBoard(@PathVariable("id") Long id,@RequestBody Board updateBoard){
        return new ResponseEntity<>(boardService.changeBoard(id, updateBoard),HttpStatus.OK);
    }

    @DeleteMapping("/api/board/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable("id") Long id){
        boardService.deleteBoard(id);
        return new ResponseEntity<>(id+"번 게시물이 삭제 되었습니다.", HttpStatus.OK);
    }
}
