package com.gilvaneamaro.dslist.services;
import java.util.List;

import com.gilvaneamaro.dslist.dto.GameListDTO;
import com.gilvaneamaro.dslist.entities.GameList;
import com.gilvaneamaro.dslist.repositories.GameListRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List <GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
