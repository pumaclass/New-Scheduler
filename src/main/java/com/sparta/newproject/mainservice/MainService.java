package com.sparta.newproject.mainservice;

import com.sparta.newproject.dto.MainRequestDto;
import com.sparta.newproject.dto.MainResponceDto;
import com.sparta.newproject.entity.Schedule;
import com.sparta.newproject.mainRepository.MainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<MainResponceDto> getSchedule() {
        //조회를 위해선 service클래스에서 관여할게 딱히 없으므로 mainrepository로 보낸다.
        return mainRepository.findAll();
    }

    public Long updateSchedule(Long id, MainRequestDto requestDto) {
        //받아온 id를 리포지토리에 보내고
        Schedule schedule = mainRepository.findById(id);
        //받아온 id값이 null이 아니라면 리포지토리에 id와 requestDto를 주고 id를 반환한다.
        if (schedule != null) {
            mainRepository.updateSchedule(id, requestDto);
            return id;
        } else {
            throw new IllegalArgumentException("선택한 입력이 존재하지않습니다.");
        }
    }

    public Long deleteSchedule(Long id) {
        Schedule schedule = mainRepository.findById(id);
        if(schedule != null){
            mainRepository.deleteSchedule(id);
        }else{
            throw new IllegalArgumentException("선택한 입력이 존재하지 않습니다");

        }
        return id;
    }
}