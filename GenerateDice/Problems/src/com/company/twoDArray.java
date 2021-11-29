package com.company;

public class twoDArray {
    public static void main(String[] args) {
        int[][] myArray = new int[64][128];

    }

    public static void array(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = j + 1;
                System.out.println(myArray[i][j]);
            }
        }
    }

}
