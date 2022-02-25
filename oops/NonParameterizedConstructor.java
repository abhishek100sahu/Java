package oops;

class Student12 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student12() {
        System.out.println("Constructor called");
    }
}

public class NonParameterizedConstructor {
    public static void main(String args[]) {
        Student12 s1 = new Student12();
        s1.name = "Shraddha";
        s1.age = 22;

        s1.printInfo();
    }
}