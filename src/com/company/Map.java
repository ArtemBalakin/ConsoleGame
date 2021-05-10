package com.company;

import java.util.Scanner;

public class Map {
    private int size;
    private char[][] value;

    public Map(Scanner scan) throws InvalidMapException {
        size = scan.nextInt();
        if (size == 0) {
            throw new InvalidMapException("Map size can not be zero");
        }
        value = new char[size][size];
        initialize(scan);
    }

    private void initialize(Scanner scan) throws InvalidMapException {
        String str;
        int row = 0;
        int column;
        int counter = 0;
        scan.nextLine();
        for (int count = size * size; count > 0; count -= size) {
            str = scan.nextLine();
            column = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    if (str.charAt(i) == 'P') {
                        MyPlayer.setPosition(new Position(column, row));
                    }
                    value[row][column] = str.charAt(i);
                    column++;
                    counter++;
                }
            }
            row++;
        }
        if (counter < Math.pow(size, 2)) {
            throw new InvalidMapException("Not enough map elements");
        }

    }

    public int getSize() {
        return size;

    }

    public char getValueAt(int row, int column) {
        return value[row][column];

    }

    public void print() {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }

}













