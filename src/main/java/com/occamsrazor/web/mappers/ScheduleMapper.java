package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.ScheduleDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleMapper {
    public List<ScheduleDto> selectAll();

}
