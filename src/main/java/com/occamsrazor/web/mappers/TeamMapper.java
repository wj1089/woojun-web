package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.TeamDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {
    public List<TeamDto> selectAll();

}
