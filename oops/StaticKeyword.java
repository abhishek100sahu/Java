package oops;

class Stud {
	String name;
	static String school;//We have similar school name for every student by putting Static keyword in front
//	it also saves memory for every students data
}
public class StaticKeyword {
	public static void main(String args[]) {
		Stud.school = "JMV";
		Stud student1 = new Stud();
		student1.name = "Tony";
		System.out.println(Stud.school);
	}
}
