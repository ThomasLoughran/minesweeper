package com.minesweeper.game.components;

import com.minesweeper.game.models.Game;
import com.minesweeper.game.repositories.CellRepository;
import com.minesweeper.game.repositories.GameRepository;
import com.minesweeper.game.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    CellRepository cellRepository;

    @Autowired
    GameService gameService;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        gameService.startNewGame();
    }

}
