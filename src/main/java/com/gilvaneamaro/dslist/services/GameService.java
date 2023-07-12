package com.gilvaneamaro.dslist.services;
import java.util.List;
import com.gilvaneamaro.dslist.dto.GameMinDTO;
import com.gilvaneamaro.dslist.entities.Game;
import com.gilvaneamaro.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List <Game> result = gameRepository.findAll();
		List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
				
		return dto;
	}
}
