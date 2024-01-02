package com.minesweeper.game.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cells")
public class Cell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @Column
    private int cellNumber;

    @Column
    private boolean isOpened;

    @Column
    private CellState cellState;


}
