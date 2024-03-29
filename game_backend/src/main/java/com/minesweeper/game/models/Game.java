package com.minesweeper.game.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "game")
    @JsonIgnoreProperties({"game"})
    @JsonIgnore
    private List<Cell> cellsList;

    public Game(){
        this.cellsList = new ArrayList<>();
    }

    public long getId(){
        return id;
    }

    public List<Cell> getCellsList() {
        return cellsList;
    }

    public void setCellsList(List<Cell> cellsList) {
        this.cellsList = cellsList;
    }

    public void addCell(Cell cell){
        this.cellsList.add(cell);
    }
}
