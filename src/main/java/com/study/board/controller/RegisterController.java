package com.study.board.controller;

import com.study.board.entity.Register;
import com.study.board.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;

    @PostMapping("/api/register")
    public ResponseEntity<?> register_save(@RequestBody Register register){
        return new ResponseEntity<>(registerService.register_save(register), HttpStatus.CREATED);
    }
}
