package com.example.tabfinal.ScrollLeague;

import java.io.Serializable;

public class LeagueIcon implements Serializable {
    private String name;
    private int image;

    public LeagueIcon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
