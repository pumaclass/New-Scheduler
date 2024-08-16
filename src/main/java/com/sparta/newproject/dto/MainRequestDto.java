package com.sparta.newproject.dto;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class MainRequestDto {
    private Long id;
    private String name;
    private String schedule;
    private String email;
    private LocalDate date;
    private LocalDate editDate;
    private String pw;
}
