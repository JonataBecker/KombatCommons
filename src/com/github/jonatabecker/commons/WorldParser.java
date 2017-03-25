package com.github.jonatabecker.commons;

import com.google.gson.Gson;

/**
 *
 * @author JonataBecker
 */
public class WorldParser {

    private final Gson gson;

    public WorldParser() {
        this.gson = new Gson();
    }

    public World toObject(String data) {
        return gson.fromJson(data, World.class);
    }

    public String fromObject(World world) {
        return gson.toJson(world);
    }
}
