package com.github.jonatabecker.commons;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JonataBecker
 */
public class World {

    private List<Player> players;
    private List<Bullet> bullets;
    
    public World() {
        this.players = new ArrayList<>();
        this.bullets = new ArrayList<>();
    }

    public synchronized List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
    
    public void removePlayer(Player player) {
        this.players.remove(player);
    }
    
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public synchronized List<Bullet> getBullets() {
        return new ArrayList<>(bullets);
    }

    public void addBullet(Bullet bullet) {
        this.bullets.add(bullet);
    }
    
    public void removeBullet(Bullet bullet) {
        this.bullets.remove(bullet);
    }
    
    public void setBullets(List<Bullet> bullets) {
        this.bullets = bullets;
    }
    
}
