package com.study.board.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long register_id;

    @Column(nullable = false) // null 값 허용 금지
    private String register_name;

    @Column(nullable = false)
    private Integer register_age;

    @Column(unique = true) // 데이터베이스 데이터 중복불가
    private String register_email;

    @Column(nullable = false)
    private String register_phone;
}
