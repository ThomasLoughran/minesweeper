package com.minesweeper.game.repositories;

import com.minesweeper.game.models.Cell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellRepository extends JpaRepository<Cell, Long> {
}
