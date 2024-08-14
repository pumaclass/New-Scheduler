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
    private LocalDate editDate;
    private String pw;

    public MainResponceDto(Schedule saveSchedule) {
        this.id = saveSchedule.getId();
        this.name = saveSchedule.getName();
        this.schedule = saveSchedule.getSchedule();
        this.date = saveSchedule.getDate();
        this.editDate = saveSchedule.getUpdateDate();
        this.pw = saveSchedule.getPw();
    }

    public MainResponceDto(Long id, String name, String schedule, LocalDate date, String pw, LocalDate editDate) {
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.date = date;
        this.editDate = editDate;
        this.pw = pw;
    }
}
