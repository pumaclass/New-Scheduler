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
    private LocalDate date;
    private LocalDate updateDate;
    private String pw;

    public Schedule(MainRequestDto requestDto) {
        this.name = requestDto.getName();
        this.schedule = requestDto.getSchedule();
        this.date = requestDto.getDate();
        this.updateDate = requestDto.getUpdateDate();
        this.pw = requestDto.getPw();
    }
}
