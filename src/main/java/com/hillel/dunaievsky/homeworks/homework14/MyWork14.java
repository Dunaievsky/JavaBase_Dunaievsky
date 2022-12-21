package com.hillel.dunaievsky.homeworks.homework14;

public class MyWork14 {
    public static void main(String[] args) {

                    Tracker tracker1 = new Tracker("Keanu", 23, 3, 1975, "keanu75@gmail.com",
                            "096892430", "Reeves", 76, 120/80, 10653);
                    tracker1.printAccountInfo();
                    System.out.println();

                    Tracker tracker2 = new Tracker("Cristiano", 19, 4, 1989, "ronaldo7@gmai.com", "073802356",
                            "Ronaldo", 85, 150/100, 8356);
                    tracker2.printAccountInfo();
                    System.out.println();

                    Tracker tracker3 = new Tracker("Roberto", 11, 2, 1984, "carlos@gmail.com", "023759429",
                            "Carlos", 71, 90/60, 6923);
                    tracker3.printAccountInfo();
                    System.out.println();

                    tracker1.setWeight(73);
                    tracker1.setPressure(123);
                    tracker1.setStepNumber(7300);
                    tracker1.printAccountInfo();
                    System.out.println();

                    tracker2.setWeight(48);
                    tracker2.setPressure(126);
                    tracker2.setStepNumber(5600);
                    tracker2.printAccountInfo();
            }
    }




