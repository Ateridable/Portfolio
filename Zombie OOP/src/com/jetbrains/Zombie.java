package com.jetbrains;

public class Zombie extends Person {
    private int x = 4, y = 4, counter = 0, counter2 = 0;

    public static void infect(char matrix[][], int x, int y, int counter,int counter2) {    //iterate through and "infect" people
        int row = 0, col = 0;
        int numIterations = 1;

        int maxIterations = matrix.length - 5;

        matrix[x][y] = 'Z';
        outputWorld(matrix);

        while (numIterations <= maxIterations) {
            for (row = x - numIterations; row <= x + numIterations; row++)
                for (col = y - numIterations; col <= y + numIterations; col++) {
                    try {
                        if (matrix[row][col] != 'i')
                            matrix[row][col] = 'Z';
                    } catch (IndexOutOfBoundsException ex) {
                        counter++;
                    }
                }
            counter2++;
                System.out.println("Loop has executed: " + counter2);
            numIterations++;
                outputWorld(matrix);
                System.out.println("Index goes out of range: " + counter);

        }
    }

    public int getInt1() {
        return x;                           // Getter and setter for my variables
    }

    public void setInt1(int newInt1) {
        this.x = newInt1;
    }

    public int getInt2() {
        return y;
    }

    public void setInt2(int newInt2) {
        this.y = newInt2;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int newCounter) {
        this.counter = newCounter;
    }
    public int getCounter2() {
        return counter2;
    }

    public void setCounter2(int newCounter2) {
        this.counter2 = newCounter2;
    }
}
