package com.github.jonatabecker.commons;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author JonataBecker
 */
public class WorldParser {

    public World toObject(String data) {
        World world = new World();
        for (String item : data.substring(1).split("#")) {
            String key = item.substring(0, 1);
            String[] itens = Arrays.asList(item.substring(1).split("\\|")).stream().
                    filter((e) -> {
                        return !e.equals("|");
                    }).collect(Collectors.toList()).toArray(new String[0]);
            if (key.equals("p")) {
                world.addPlayer(parsePlayer(itens));
            } else {
                world.addBullet(parseBullet(itens));
            }
        }
        return world;
    }

    private Player parsePlayer(String[] data) {
        Player p = new Player();
        p.setKey(Integer.parseInt(data[0]));
        p.setLive(Float.parseFloat(data[1]));
        p.setPos(Integer.parseInt(data[2]));
        p.setState(Integer.parseInt(data[3]));
        p.setX(Integer.parseInt(data[4]));
        p.setY(Integer.parseInt(data[5]));
        return p;
    }

    private Bullet parseBullet(String[] data) {
        return new Bullet(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
    }

    public String fromObject(World world) {
        StringBuilder sb = new StringBuilder();
        world.getPlayers().forEach((p) -> {
            sb.append("#p");
            sb.append(p.getKey()).append("|");
            sb.append(p.getLive()).append("|");
            sb.append(p.getPos()).append("|");
            sb.append(p.getState()).append("|");
            sb.append(p.getX()).append("|");
            sb.append(p.getY());
        });
        world.getBullets().forEach((b) -> {
            sb.append("#b");
            sb.append(b.getX()).append("|");
            sb.append(b.getY());
        });
        return sb.toString();
    }
}
