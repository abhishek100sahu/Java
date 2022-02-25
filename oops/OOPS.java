package oops;

class PEN {
    String color;
    String type;//ballpoint, gel

    public void write() {
        System.out.println("writting Something");
    }

    public void printColor() {
    	System.out.println(this.color);
    }
}

public class OOPS {
    public static void main(String args[]) {
        PEN pen1 = new PEN();
        pen1.color = "Blue";
        pen1.type = "Gel";

        PEN pen2 = new PEN();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}
