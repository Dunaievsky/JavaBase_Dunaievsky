package com.hillel.dunaievsky.homeworks.homework15;

public abstract class MusicStyles {
    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void playMusic();
}



