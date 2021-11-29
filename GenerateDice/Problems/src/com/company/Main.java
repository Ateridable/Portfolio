package com.company;

public class Main {
    public static void main(String[] args){
        int x = 34;
        int y = 35;
        int z = add(x,y);
        System.out.println(z);
    }

    public static int add(int x,int y) {
	int sum;
	sum = x + y;

	return sum;
    }
}
