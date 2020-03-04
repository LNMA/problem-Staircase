package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(">> please input integer number: ");
        int depth = input.nextInt();

        String[][] arr = new String[depth + 1][depth + 1];

        printStairs(arr, depth);

    }

    public static void printStairs(String[][] arr, int depth) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            int fillNumber = depth - (depth - i) - 1;
            int space = (depth / (i + 1)) - 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (j > space && counter <= fillNumber) {
                    arr[i][j] = " # ";
                    counter++;
                } else {
                    arr[i][j] = " ";
                }

            }
        }

        for (String[] n1 : arr) {
            for (String n2 : n1) {
                System.out.print(n2);
            }
            System.out.println();
        }
    }
}
