package com.sparta.newproject.entity;

import com.sparta.newproject.dto.MainRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Setter

public class Schedule {
    private Long id;
    private String name;
    private String schedule;
    private String email;
    private LocalDate date;
    private LocalDate editDate;
    private String pw;

    public Schedule(MainRequestDto requestDto) {
        this.name = requestDto.getName();
        this.schedule = requestDto.getSchedule();
        this.email = requestDto.getEmail();
        this.date = requestDto.getDate();
        this.editDate = requestDto.getEditDate();
        this.pw = requestDto.getPw();
    }
}
