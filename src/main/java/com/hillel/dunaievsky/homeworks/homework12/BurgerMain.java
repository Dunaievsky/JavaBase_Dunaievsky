package com.hillel.dunaievsky.homeworks.homework12;

public class BurgerMain {

    public static void main(String[] args) {

        Burger full = new Burger("bun", "meat", "cheese", "lettuce", "mayonese");

        Burger dietetic = new Burger("bun", "meat", "cheese", "lettuce");

        Burger doubleMeat = new Burger("bun", "meat", "cheese", "lettuce", "mayonese",
                true);
    }
}


