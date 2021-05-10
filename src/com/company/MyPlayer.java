package com.company;

public class MyPlayer implements Player {
    private static Position position;

    public MyPlayer() {
    }

    @Override
    public void moveRight() {
        if (Game.getMap().getSize() > position.getX() + 1) {
            if (Game.getMap().getValueAt(position.getY(), position.getX() + 1) != '1')
                position.setX(position.getX() + 1);
        }
    }

    @Override
    public void moveLeft() {
        if (0 <= position.getX() - 1)
            if (Game.getMap().getValueAt(position.getY(), position.getX() - 1) != '1')
                position.setX(position.getX() - 1);
    }

    @Override
    public void moveUp() {
        if (0 <= position.getY() - 1)
            if (Game.getMap().getValueAt(position.getY() - 1, position.getX()) != '1')
                position.setY((position.getY() - 1));
    }

    @Override
    public void moveDown() {
        if (Game.getMap().getSize() > position.getY() + 1)
            if (Game.getMap().getValueAt(position.getY() + 1, position.getX()) != '1')
                position.setY(position.getY() + 1);
    }

    public void setMap(Map map) {
    }

    @Override
    public Position getPosition() {
        return position;
    }

    public static void setPosition(Position pos) {
        MyPlayer.position = pos;
    }
}
