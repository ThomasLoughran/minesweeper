package com.minesweeper.game.services;

import com.minesweeper.game.models.Cell;
import com.minesweeper.game.models.Game;
import com.minesweeper.game.repositories.CellRepository;
import com.minesweeper.game.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    CellRepository cellRepository;

    @Transactional
    public Game startNewGame(){
        Game game = new Game();
        gameRepository.save(game);

        makeCells(400, game);
        gameRepository.save(game);
        return game;
    }

    public void makeCells(int numberOfCells, Game game){
        for (int i = 0; i < numberOfCells; i++){
            Cell cell = new Cell();
            cell.setCellNumber(i);
            cell.setGame(game);
            cellRepository.save(cell);
            game.addCell(cell);
        }
    }



}
