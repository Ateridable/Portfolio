package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
