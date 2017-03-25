package com.github.jonatabecker.commons;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JonataBecker
 */
public class World {

    private List<Player> players;

    public World() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
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
    
}
