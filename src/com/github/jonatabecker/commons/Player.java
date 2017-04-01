package com.github.jonatabecker.commons;

/**
 *
 * @author JonataBecker
 */
public class Player {

    public transient static final int WIDTH = 65;
    public transient static final int HEIGHT = 135;

    public transient static final int WAITING = 1;
    public transient static final int WALKING = 2;
    public transient static final int PUNCHING = 3;

    public transient static final int POS_LEFT = 1;
    public transient static final int POS_RIGHT = 2;

    public transient static final int MAX_LIVE = 50;

    public transient static int counter = 1;

    private final int key;
    private int x;
    private int y;
    private int pos;
    private int state;
    private float live;

    public Player() {
        this.key = counter++;
        this.x = 10;
        this.y = 150;
        this.live = MAX_LIVE;
        this.pos = POS_LEFT;
        this.state = WAITING;
    }

    public int getKey() {
        return key;
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

    public float getLivePercent() {
        return (live * 100) / MAX_LIVE;
    }

    public void hit() {
        hit(1);
    }
    
    public void hitPunch() {
        hit(0.2f);
    }
    
    private void hit(float val) {
        this.live -= val;
        if (this.live < 0) {
            this.live = 0;
        }
    }

    public boolean isDead() {
        return live == 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.key;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.key != other.key) {
            return false;
        }
        return true;
    }

}
