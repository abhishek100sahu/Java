package oops;

class Student123 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name) {
    	System.out.println(name);
    }

    public void printInfo(int age) {
    	System.out.println(age);
    }

    public void printInfo(String name, int age) {
    	System.out.println(name+" "+age);
    }

    Student123() {
        System.out.println("Constructor called");
    }
}

public class FuntionOverloading {
    public static void main(String args[]) {
        Student123 s1 = new Student123();
        s1.name = "Shraddha";
        s1.age = 22;

        s1.printInfo(s1.name, s1.age);
    }
}