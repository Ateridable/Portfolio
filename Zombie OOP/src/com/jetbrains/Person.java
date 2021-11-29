package com.jetbrains;

public class Person  {
    public static void populate(char matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {           //Populate world
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '.';
            }
        }
    }
    public static void outputWorld(char matrix[][]) {       //Print world
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}