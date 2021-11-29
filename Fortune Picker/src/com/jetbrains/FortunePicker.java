/*Creating a paper fortune picker virtually
Using a series of fortune and input to guide you to the correct fortune */

package com.jetbrains;

import java.util.Scanner;

public class FortunePicker {

    public static void main(String[] args) {

        String f1n2 = "You cannot love life until you live the life you love.",
                f3n4 = "You learn from your mistakes... You will learn a lot today.",
                f5n6 = "You already know the answer to the questions lingering inside your head.",
                f7n8 = "Jealousy doesn't open doors, it closes them!";

        Scanner userInput = new Scanner(System.in);                                                             // Asking for First input
        System.out.println("If you would like your fortune told, start with a number between 1-4.");
        int firstInput = userInput.nextInt();


        if (firstInput == 1 || firstInput == 3) {                        // evaluating the first input and "moving" the fortune picker
            System.out.println("Choose either 1, 3, 5, 7");

        } else if (firstInput == 2 || firstInput == 4) {
            System.out.println("Choose either 2, 4, 6, 8");

        } else {
            System.out.println("Number not in range please try again.");
        }

        Scanner userInput2 = new Scanner(System.in);
        int secondInput = userInput2.nextInt();

        if (secondInput == 1 || secondInput == 3 || secondInput == 5 || secondInput == 7) {             // evaluating the second input and "moving" the fortune picker
            System.out.println("Choose either 2, 4, 6, 8 for your fortune...");
        } else if (secondInput == 2 || secondInput == 4 || secondInput == 6 || secondInput == 8) {
            System.out.println("Choose either 1, 3, 5, 7 for your fortune...");

        } else {
            System.out.println("Number not in range please try again.");
        }

        Scanner userInput3 = new Scanner(System.in);
        int thirdInput = userInput3.nextInt();

        if (thirdInput == 1 || thirdInput == 2) {                           //Taking the last input and evaluating what fortune to pick
            System.out.println(f1n2);
        } else if (thirdInput == 3 || thirdInput == 4){
        System.out.println(f3n4);
        } else if (thirdInput == 5 || thirdInput == 6){
            System.out.println(f5n6);
        } else if (thirdInput == 7 || thirdInput == 8) {
            System.out.println(f7n8);
        }
    }
}