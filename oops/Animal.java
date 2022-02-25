package oops;
abstract class Animals { //Its an idea /concept
	abstract void walk();//this function will be present on all its child classes
}

class Horse extends Animals {
	@Override
	public void walk() {
		System.out.println("Walk's on 4 legs");
	}
}

class Chicken extends Animals {
	@Override
	public void walk() {
		System.out.println("Walk's on 2 legs");
	}
}
public class Animal {
	public static void main(String args[]) {
		Horse horse = new Horse();
		horse.walk();
	}
}
