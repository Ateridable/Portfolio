
//Generate Dice Program by taking an input for amount of dice pairs to throw
// Printing out whenever a dice roll has an identical pair
// calculate the average of all the rolls

package com.jetbrains;

import java.util.Scanner;

public class GenerateDice {

        public static void main(String[] args) {
            Scanner userInputNum = new Scanner(System.in);                                      // Scan for user input and initialize average variable
            System.out.println("How many times would you like to throw the dice?");
            int Input = userInputNum.nextInt();
            float avg = 0.0F;

            for(int i = 0; i < Input; ++i) {
                int dice1 = (int)(Math.random() * 6.0D + 1.0D);
                int dice2 = (int)(Math.random() * 6.0D + 1.0D);                                         // for loop responsible for generating dice, keeping avg total, and letting you know if it's a pair
                avg += (float)(dice2 + dice1);
                if (dice1 == dice2) {
                    System.out.println(dice1 + " " + dice2 + " You threw a pair!");
                } else {
                    System.out.println(dice1 + " " + dice2);
                }
            }

            System.out.println("");
            double avg2 = (double)(avg / (float)(Input * 2));
            System.out.println("The average is " + avg2);                                       // calculating average and printing it
        }
    }
