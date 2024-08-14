package com.sparta.newproject.dto;

import com.sparta.newproject.entity.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class MainResponceDto {
    private Long id;
    private String name;
    private String schedule;
    private LocalDate date;
    private LocalDate updateDate;
    private String pw;

    public MainResponceDto(Schedule saveSchedule) {
        this.id = saveSchedule.getId();
        this.name = saveSchedule.getName();
        this.date = saveSchedule.getDate();
        this.updateDate = saveSchedule.getUpdateDate();
        this.pw = saveSchedule.getPw();
    }
}
