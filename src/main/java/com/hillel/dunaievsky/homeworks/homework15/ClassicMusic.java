package com.hillel.dunaievsky.homeworks.homework15;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Play ClassicMusic " + getName());

    }
}




