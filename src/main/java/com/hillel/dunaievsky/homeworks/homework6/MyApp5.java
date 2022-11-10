package com.hillel.dunaievsky.homeworks.homework6;

public class MyApp5 {

    public static void main(String[] args) {

        int count = 0;
        int i = 1;
        int k;
        int j;

        while (i <= 100) {

            count++;

            if ((count % 100) == 0) {
                k = count / 10;
            } else {
                k = count % 100 / 10;
            }

            j = count % 10;

            if ((k == 9 || k == 4) || (j == 9 || j == 4)) {
                continue;
            } else if (count == 9 || count == 4) {
                continue;
            } else {
                System.out.println("Номер шатлу: " + count);
            }

            i++;
        }


    }






}
