package com.hillel.dunaievsky.homeworks.homework7;


public class MyApp7 {


    public static void main(String[] args) {


        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = randomAge(18, 40);
            sum1 += firstTeam[i];
            secondTeam[i] = randomAge(18, 40);
            sum2 += secondTeam[i];
        }


        print(firstTeam, sum1, 1);
        print(secondTeam, sum2, 2);

    }

    private static int randomAge(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

    private static void print(int[] arr, int sum, int teamNum) {

        System.out.println("Гравці " + teamNum + " команди мають такий вік: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i] + " , ");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + ".");
            } else {
                System.out.print(arr[i] + " , ");
            }
        }
        System.out.println("Середній вік команди становить: " + (sum / arr.length));

    }
}