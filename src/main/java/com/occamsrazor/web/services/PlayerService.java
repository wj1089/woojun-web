package com.occamsrazor.web.services;

import com.occamsrazor.web.domains.PlayerDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PlayerService {
    public List<PlayerDto> retrieveAll();
}
