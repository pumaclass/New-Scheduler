package com.sparta.newproject.maincontroller;

import com.sparta.newproject.dto.MainRequestDto;
import com.sparta.newproject.dto.MainResponceDto;
import com.sparta.newproject.mainservice.MainService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 저장, 조회, 수정, 삭제를 구현 할거야

// 3계층 레이어를 Controller, Service, Repository로 구성할거야

// 1. 저장
// Controller에서 요청 받을 값인 json 데이터를 자바형식으로 바꿔서 Service로 보낼거야
// Service에 넘긴 데이터를 entity형식으로 바꿔줄거야
// entity형식으로 바뀐 데이터를 Repository에서 DB에 저장할거야.

// 2. 조회
// db에 저장 된 데이터를 서비스로 가져올거야
// 데이터를 조회해야 하니까 @getMapping를 써야해
//

@RestController
@RequestMapping("/api")
public class MainController {
   //속성 = 반드시 생성자가 있어야함
    private final MainService mainService;

    //생성자
    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @PostMapping("/schedules")
    //createSchedule 생성 후 @RequestBody
    MainResponceDto createSchedule(@RequestBody MainRequestDto requestDto){
        return mainService.createSchedule(requestDto);
    }

    @GetMapping("/schedules")
     List<MainResponceDto> getSchedules(){
        return mainService.getSchedule();
    }
}
