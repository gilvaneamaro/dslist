package com.gilvaneamaro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilvaneamaro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
