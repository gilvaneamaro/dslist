package com.gilvaneamaro.dslist.dto;

import com.gilvaneamaro.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	GameListDTO(){
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
