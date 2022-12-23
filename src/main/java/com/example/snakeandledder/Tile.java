package com.example.snakeandledder;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    public Tile (int size){
        setWidth(size);
        setHeight(size);
        setFill(Color.GREEN);
        setStroke(Color.BLACK);
    }
}

