package com.minesweeper.game.models;

import jakarta.persistence.*;

@Entity
@Table
public class Cell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;


}
