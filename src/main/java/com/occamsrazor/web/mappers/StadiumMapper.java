package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.StadiumDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadiumMapper {
    public List<StadiumDto> selectAll();

}
