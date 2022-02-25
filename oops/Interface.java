package oops;

interface Anim {
	int eyes = 2;
	void walk();
}

interface Herbivore {

}
class Hor implements Anim {
	@Override
	public void walk() {
		System.out.println("Walk's on 4 legs");
	}
}
public class Interface {
	public static void main(String args[]) {
		Hor horse = new Hor();
		horse.walk();
	}
}
