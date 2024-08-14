package com.sparta.newproject.mainservice;

import com.sparta.newproject.dto.MainRequestDto;
import com.sparta.newproject.dto.MainResponceDto;
import com.sparta.newproject.entity.Schedule;
import com.sparta.newproject.mainRepository.MainRepository;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    public final MainRepository mainRepository;

    public MainService(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    //MainController에서 requestDto를 받아옴
    public MainResponceDto createSchedule(MainRequestDto requestDto) {
        //requestDto -> entity
        //데이터베이스에 저장 될 구조로 변경
        Schedule schedule = new Schedule(requestDto);

        //변환된 entity를 데이터베이스에 저장
        Schedule saveSchedule = mainRepository.save(schedule);

        // 클라이언트에게 응답할 데이터 구조를 반환
        return new MainResponceDto(saveSchedule);

    }

}


