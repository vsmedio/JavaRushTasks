package com.javarush.task.task22.task2213;


/**
 * Created by Sukora Stas.
 */
public class Tetris {

    private Field field;
    private Figure figure;

    static Tetris game;

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public void run() {

    }

    public void step() {

    }


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}