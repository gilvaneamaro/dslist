package com.gilvaneamaro.dslist.services;
import java.util.List;

import com.gilvaneamaro.dslist.dto.GameDTO;
import com.gilvaneamaro.dslist.dto.GameMinDTO;
import com.gilvaneamaro.dslist.entities.Game;
import com.gilvaneamaro.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List <Game> result = gameRepository.findAll();
		List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
				
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id){
		Game result = gameRepository.findById(id).get(); //Da pra fazer um tratamento de exceção nessa parte
		GameDTO dto = new GameDTO(result);
		
		return dto;
	}
}
