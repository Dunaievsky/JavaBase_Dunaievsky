package com.hillel.dunaievsky.homeworks.homework12;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String lettuce;
    String mayonese;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = greens;
        this.mayonese = mayo;
        System.out.println(this);
    }


    public String toString() {
        return "Burger 'full' consists of:" +
                " " + bun +
                ", " + meat +
                ", " + cheese +
                ", " + lettuce +
                ", " + mayonese +
                '.';
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = greens;

        printInfo();
    }

    void printInfo() {
        System.out.println("Burger 'dietetic' consists of: " + bun + ", " + meat
                + ", " + cheese + ", " + lettuce + ".");
    }


    public Burger(String bun, String meat, String cheese, String greens, String mayo, boolean isDouble) {
        this.bun = bun;
        this.meat = isDouble ? "doubleMeat" : meat;
        this.cheese = cheese;
        this.lettuce = greens;
        this.mayonese = mayo;

        System.out.println("Burger 'doubleMeat' consists of: " + this.bun + ", " +
                this.meat + ", " + this.cheese + ", " + this.lettuce + ", " + this.mayonese + ".");
    }
}



