package com.jetbrains;

public class Driver {												                                                                    


	public static void main(String[] args) {
	char zWorld[][] = new char [10][10];
	Person people = new Person();								//Driver creates all my objects and runs their methods and gets variables
	ImmunePerson immune = new ImmunePerson();
	Zombie zed = new Zombie();
	people.populate(zWorld);
	immune.immune(zWorld);
	people.outputWorld(zWorld);
	zed.infect(zWorld, zed.getInt1(),zed.getInt2(), zed.getCounter(), zed.getCounter2());
	System.out.println("Time in nanoseconds is: " + System.nanoTime());
    }
}
