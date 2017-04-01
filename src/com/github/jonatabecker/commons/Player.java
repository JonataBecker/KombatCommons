package com.github.jonatabecker.commons;

/**
 *
 * @author JonataBecker
 */
public class Player {

    public transient static int WIDTH = 65;
    public transient static int HEIGHT = 135;
    
    public transient static int WAITING = 1;
    public transient static int WALKING = 2;
    public transient static int PUNCHING = 3;
    
    public transient static int POS_LEFT = 1;
    public transient static int POS_RIGHT = 2;
    
    private int x;
    private int y;
    private int pos;
    private int state;

    public Player() {
        this.x = 10;
        this.y = 300;
        this.pos = POS_LEFT;
        this.state = WAITING;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getState() {
        return state;
    }

    public boolean isWalking() {
        return state == WALKING;
    }

    public boolean isWaiting() {
        return state == WAITING;
    }

    public boolean isPunching() {
        return state == PUNCHING;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public boolean isPosRight() {
        return pos == POS_RIGHT;
    }
}
