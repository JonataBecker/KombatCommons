package com.github.jonatabecker.commons;

/**
 *
 * @author JonataBecker
 */
public class Bullet {

    private transient Player player;
    private transient int pos;
    private int x;
    private int y;

    public Bullet(Player player, int x, int y) {
        this.pos = player.getPos();
        this.player = player;
        this.x = x;
        this.y = y;
    }
    
    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getPos() {
        return pos;
    }

    public Player getPlayer() {
        return player;
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

}
