package com.hillel.dunaievsky.homeworks.homework9;

import java.util.Scanner;

public class MyApp9 {


        public static void main(String[] args) {

            System.out.println("Будь ласка, введіть два числа для масивів: ");
            System.out.print("Перше число: ");
            int m = inSys();
            System.out.print("Друге число: ");
            int n = inSys();


            int[][] array1 = new int[m][n];
            int[][] array2 = new int[n][m];

            for (int i = 0, k = 0; i < m; i++, k++) {
                for (int j = 0, l = 0; j < n; j++, l++) {
                    array1[i][j] = (int) (Math.random() * 10);
                    array2[j][k] = array1[i][j];
                }
            }

            System.out.println("Перший масив: ");
            printArr(array1);
            System.out.println("Другий масив: ");
            printArr(array2);

        }

        private static int inSys() {

            Scanner sc = new Scanner(System.in);

            int number = 0;

            for (; ; ) {
                if (!sc.hasNextInt()) {
                    System.out.println("Помилкові дані! Має бути додатнє число. Спробуй ще раз:");
                    sc.nextLine();
                } else {
                    number = sc.nextInt();
                    if (number <= 0) {
                        System.out.println("Помилкові дані! Має бути додатнє число. Спробуй ще раз:");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
            }

            return number;
        }

        public static void printArr(int[]  [] array) {
            for (int[] ints : array) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }
















