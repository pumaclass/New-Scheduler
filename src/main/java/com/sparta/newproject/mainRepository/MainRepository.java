package com.sparta.newproject.mainRepository;

import com.sparta.newproject.entity.Schedule;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class MainRepository {
    private final JdbcTemplate jdbcTemplate;

    public MainRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Schedule save(Schedule schedule) {

        //일단 이런게 있구나 정도로 이해하자
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String sql = "INSERT INTO schedule(name,schedule,date,pw) VALUES(?,?,?,?)";
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, schedule.getName());
            ps.setString(2, schedule.getSchedule());
            ps.setObject(3, schedule.getDate());
            ps.setString(4, schedule.getPw());
            return ps;
        },keyHolder);
        Long id = keyHolder.getKey().longValue();
        return schedule;
    }
}
