package com.company;

public class Position {
    private int row;
    private int column;

    public Position(int column, int row) {
        this.row = row;
        this.column = column;
    }

    public int getX() {
        return column;
    }

    public void setX(int column) {
        this.column = column;
    }

    public int getY() {
        return row;
    }

    public void setY(int row) {
        this.row = row;
    }

    public boolean equals(Position pos) {
        if (this.row != pos.row) return false;
        if (this.column != pos.column) return false;
        return true;
    }

    public String toString() {
        return "(" + row + "," + column + ")";
    }
}
