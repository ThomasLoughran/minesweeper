package com.minesweeper.game.controllers;

import com.minesweeper.game.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minesweeper")
public class GameController {

    @Autowired
    com.minesweeper.game.services.GameService gameService;

    @PostMapping
    public ResponseEntity<Game> startNewGame(){
        Game game = gameService.startNewGame();
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }

}