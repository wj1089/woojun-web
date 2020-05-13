package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.PlayerDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDto> selectAll();
}
