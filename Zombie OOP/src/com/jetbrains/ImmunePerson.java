package com.jetbrains;

class ImmunePerson extends Person {                             //Set up immunity in the group
    public static void immune(char matrix[][]){
        for (int i = 0; i <= 10; i++) {
            int x = (int) (Math.random() * 8 + 1);
            int y = (int) (Math.random() * 8 + 1);
            matrix[x][y] = 'i';
        }
    }
}
