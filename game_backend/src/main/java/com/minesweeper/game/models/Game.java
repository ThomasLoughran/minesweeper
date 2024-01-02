package com.minesweeper.game.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "game")
    @JsonIgnoreProperties({"game"})
    private List<Cell> cellsList;

    public Game(){

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
