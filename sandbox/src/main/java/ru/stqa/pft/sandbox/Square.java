package ru.stqa.pft.sandbox;

public class Square {

    public double l;

    public Square(double len) {
        this.l = len;
    }

    public double aria() {
        return this.l * this.l;
    }
}
