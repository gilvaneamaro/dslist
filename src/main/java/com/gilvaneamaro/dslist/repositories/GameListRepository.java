package com.gilvaneamaro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gilvaneamaro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
