package com.hillel.dunaievsky.homeworks.homework15;

public class MyWork15 {

    public static void main(String[] args) {


        MusicStyles [] musicStyles = {
                new RockMusic("30 Seconds to Mars"),
                new ClassicMusic("Bang"),
                new PopMusic("Michael Jackson")
        };
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }






    }




}
















