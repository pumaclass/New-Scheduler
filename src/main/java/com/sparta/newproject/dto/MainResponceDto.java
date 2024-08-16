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
    private String email;
    private LocalDate date;
    private LocalDate editDate;
    private String pw;

    public MainResponceDto(Schedule saveSchedule) {
        this.id = saveSchedule.getId();
        this.name = saveSchedule.getName();
        this.schedule = saveSchedule.getSchedule();
        this.email = saveSchedule.getEmail();
        this.date = saveSchedule.getDate();
        this.editDate = saveSchedule.getEditDate();
        this.pw = saveSchedule.getPw();
    }

    public MainResponceDto(Long id, String name, String schedule, String email, LocalDate date, String pw, LocalDate editDate) {
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.email = email;
        this.date = date;
        this.editDate = editDate;
        this.pw = pw;
    }
}
