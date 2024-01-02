package com.minesweeper.game.repositories;

import com.minesweeper.game.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
