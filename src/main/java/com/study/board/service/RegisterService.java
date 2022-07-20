package com.study.board.service;

import com.study.board.entity.Register;
import com.study.board.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final RegisterRepository registerRepository;

    public Register register_save(Register register){
        return registerRepository.save(register);
    }
}
