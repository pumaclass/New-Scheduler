package com.sparta.newproject.dto;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class MainRequestDto {
    private Long id;
    private String name;
    private String schedule;
    private LocalDate date;
    private LocalDate updateDate;
    private String pw;
}
