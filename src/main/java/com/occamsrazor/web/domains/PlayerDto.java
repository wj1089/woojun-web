package com.occamsrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlayerDto {
    public String playerId, playerName, ePlayerName, nickname, joinYyyy, position, backNo, nation, birthDate, solar,
            height, weight, teamId;
}