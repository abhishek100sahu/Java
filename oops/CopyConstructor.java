package oops;

class Studentid {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Studentid(Studentid s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Studentid() {

    }
}

public class CopyConstructor {
    public static void main(String args[]) {
    	Studentid s1 = new oops.Studentid();
        s1.name = "aman";
        s1.age = 24;

        Studentid s2 = new Studentid(s1);

        s1.printInfo();
        s2.printInfo();
    }
}
