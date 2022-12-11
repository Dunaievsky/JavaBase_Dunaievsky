package com.hillel.dunaievsky.homeworks.homework14;

public class MyWork14 {
    public static void main(String[] args) {

            Tracker tracker1 = new Tracker("Keanu", 23, "May", 1975, "keanu75@gmail.com", "096892430", "Reeves", 76, "120/80", 10653);
            Tracker tracker2 = new Tracker("Cristiano", 19, "April", 1989, "ronaldo7@gmai.com", "073802356", "Ronaldo", 85, "150/100", 8356);
            Tracker tracker3 = new Tracker("Roberto", 11, "Febraury", 1984, "carlos@gmail.com", "023759429", "Carlos", 71, "90/60", 6923);
            tracker1.printAccountInfo();
            tracker2.printAccountInfo();
            tracker3.printAccountInfo();
            tracker2.setSurname("Ronaldo");
            tracker1.setSteps(150);
            tracker3.setWeight(49.9);
            tracker2.setPressure("130/90");
            tracker1.printAccountInfo();
            tracker2.printAccountInfo();
            tracker3.printAccountInfo();

        }
    }



